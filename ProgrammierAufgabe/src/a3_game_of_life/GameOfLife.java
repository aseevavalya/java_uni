package a3_game_of_life;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameOfLife {


	private static final int FREQUENCY = 15;
	private final static double SPEED = 0.25;

	public static void main(String[] args) {

		JFrame frame = setFrame();
		boolean[][] cells = generateCells();
		cells = generateGliderPreset();
		cells = generateAbstractPreset();
		
		while (true) {
			cells = conwaysRules(cells);
			frame.add(BorderLayout.CENTER, new MapView(cells));
			frame.setVisible(true);

			try {
				Thread.sleep((int) (SPEED * 1000));
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
	
	/**
	 * setzt die Einstellung des Frames (Fenster)
	 * 
	 * @return Frame
	 */
	public static JFrame setFrame() {
		JFrame frame = new JFrame();

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = new Dimension((int) (screenSize.width), (int) (screenSize.height));
		int frameWidth = MapView.getCELLSIZE() * 102 + 16;
		int frameHeight = MapView.getCELLSIZE() * 102 + 38;
		frame.setBounds((int) (0.5 * (frameSize.width - frameWidth)), (int) (0.5 * (frameSize.height - frameHeight)),
				frameWidth, frameHeight);

		frame.setTitle("Game of Life");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		return frame;
	}

	/**
	 * gibt ein zweidimensionales (x- und y-Koordinate) boolean-Array mit zuf�ligem
	 * Inhalt aus, dabei entspricht true einer lebenden und false eine tote Zelle
	 * 
	 * @return zweidimensionales Array mit lebenden und toten Zellen
	 */
	public static boolean[][] generateCells() {
		boolean[][] cells = new boolean[102][102];

		for (int y = 1; y <= 100; y++) {
			for (int x = 1; x <= 100; x++) {
				int random = (int) (Math.random() * 10);
				if (random < (FREQUENCY / 10)) {
					cells[x][y] = true;
				} else {
					cells[x][y] = false;
				}
			}
		}

		for (int i = 0; i <= 101; i++) {
			cells[i][0] = false;
			cells[i][101] = false;
			cells[0][i] = false;
			cells[101][i] = false;
		}

		return cells;

	}

	/**
	 * gibt ein zweidimensionales (x- und y-Koordinate) boolean-Array mit dem
	 * berühmtem Glider als Inhalt aus, dabei entspricht true einer lebenden und
	 * false eine tote Zelle
	 * 
	 * @return zweidimensionales Array mit lebenden und toten Zellen
	 */
	public static boolean[][] generateGliderPreset() {
		boolean[][] cells = new boolean[102][102];

		for (int y = 1; y <= 101; y++) {
			for (int x = 1; x <= 101; x++) {
				cells[x][y] = false;
			}
		}

		cells[2][1] = true;
		cells[1][3] = true;
		cells[2][3] = true;
		cells[3][3] = true;
		cells[3][2] = true;

		return cells;
	}

	/**
	 * gibt ein zweidimensionales (x- und y-Koordinate) boolean-Array mit
	 * vorgegebenem Inhalt aus, dabei entspricht true einer lebenden und false eine
	 * tote Zelle.
	 * 
	 * Die dargestellte Figur baut sich zunächst größer auf um dann zu kollabieren
	 * und gänzlich zu sterben.
	 * 
	 * @return zweidimensionales Array mit lebenden und toten Zellen
	 */
	public static boolean[][] generateAbstractPreset() {
		boolean[][] cells = new boolean[102][102];

		for (int y = 1; y <= 101; y++) {
			for (int x = 1; x <= 101; x++) {
				cells[x][y] = false;
			}
		}

		cells[50][50] = true;
		cells[51][50] = true;
		cells[52][50] = true;
		cells[50][51] = true;
		cells[50][52] = true;
		cells[52][51] = true;
		cells[52][52] = true;
		cells[50][54] = true;
		cells[50][55] = true;
		cells[50][56] = true;
		cells[51][56] = true;
		cells[52][56] = true;
		cells[52][55] = true;
		cells[52][54] = true;

		return cells;
	}

	/**
	 * Liest ein zweidimensionales Array von Zellen ein, auf dem die von Conway
	 * formulierten Regeln angewandt werden. Die aus den Regeln entstandenen toten
	 * und lebenden Zellen werden in einem neuen Array gespeichert und ausgegeben.
	 * 
	 * @param cells das Array der Zellen, das ausgelesen wird.
	 * 
	 * @return neues zweidimensionales Array mit lebenden und toten Zellen
	 */

	public static boolean[][] conwaysRules(boolean[][] cells) {
		int rows = cells.length;
		int cols = cells[0].length;
		boolean[][] nextGen = new boolean[rows][cols];
		
		for (int i = 1; i < rows - 1; i++) {
			for (int j = 1; j < cols - 1; j++) {
				int aliveNeighbors = countAliveNeighbors(cells, i, j);
				
				if (cells[i][j]) {
					nextGen[i][j] = aliveNeighbors == 2 || aliveNeighbors == 3;
				} else {
					nextGen[i][j] = aliveNeighbors == 3;
				}
			}
		}
		return nextGen;
	}
	
	private static int countAliveNeighbors(boolean[][] cells, int i, int j) {
		int count = 0;
		
		for (int x = -1; x <= 1; x++) {
			for (int y = -1; y <= 1; y++) {
				if (x == 0 && y == 0) {
					continue;
				} 
				if (cells[x+i][y+j]) {
					count++;
				}
			}
		}
		return count;
	}
}




