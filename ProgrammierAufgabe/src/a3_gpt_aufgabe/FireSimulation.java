package a3_gpt_aufgabe;
import java.awt.*;
import javax.swing.*;

	public class FireSimulation {
	    private static final int SIZE = 20;
	    private static final int CELL_SIZE = 20;

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Forest Fire Simulation");
	        int[][] forest = generateForest(SIZE);

	        frame.setSize(SIZE * CELL_SIZE + 20, SIZE * CELL_SIZE + 40);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        ForestPanel panel = new ForestPanel(forest);
	        frame.add(panel);
	        frame.setVisible(true);

	        while (true) {
	            forest = simulateFire(forest); // Реализуйте этот метод!
	            panel.setForest(forest);
	            panel.repaint();

	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException ex) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }

	    public static int[][] generateForest(int size) {
	        int[][] forest = new int[size][size];
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                forest[i][j] = Math.random() < 0.6 ? 1 : 0; // 60% деревьев
	            }
	        }
	        forest[size / 2][size / 2] = 2; // Горящее дерево в центре
	        return forest;
	    }

	    public static int[][] simulateFire(int[][] forest) {
	    	int rows = forest.length;
	    	int cols = forest[0].length;
	    	int[][] newForest = new int[rows][cols];
	    	
	    	boolean fireExists = false;
	    	
	        for (int i = 0; i < rows; i++) {
	        	for (int j = 0; j < cols; j++) {
	        		newForest[i][j] = forest[i][j];
	        	}
	        }
	        for (int i = 0; i < rows; i++) {
	        	for (int j = 0; j < cols; j++) {
	        		if (forest[i][j] == 2) {
	        			fireExists = true;
	        			for (int x = -1; x <= 1; x++) {
	        				for (int y = -1; y <= 1; y++) {
	        					if (x == 0 && y == 0) {
	        	        			continue;
	        				    }
	        					int newX = i+x;
	        					int newY = j+y;
	        					if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
	        						if (forest[newX][newY] == 1) {
	        							newForest[newX][newY] = 2;
	        						}
	        					}
	        				}
	        			}
	        			newForest[i][j] = 0;
	        	
	        			
	        		}
	        	}
	        }
	        if (!fireExists) {
	        	System.out.println("Лес полностью сгорел!");
	        	System.exit(0);
	        }
	        
	        return newForest;
	    }

	static class ForestPanel extends JPanel {
	    private int[][] forest;

	    public ForestPanel(int[][] forest) {
	        this.forest = forest;
	    }

	    public void setForest(int[][] forest) {
	        this.forest = forest;
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        for (int i = 0; i < forest.length; i++) {
	            for (int j = 0; j < forest[i].length; j++) {
	                switch (forest[i][j]) {
	                    case 0 -> g.setColor(Color.GRAY); // Пустое место
	                    case 1 -> g.setColor(Color.GREEN); // Дерево
	                    case 2 -> g.setColor(Color.RED); // Горящее дерево
	                }
	                g.fillRect(j * 20, i * 20, 20, 20);
	            }
	        }
	    }
	}
}
