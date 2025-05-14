package a3_Kaminfeuer;
import java.awt.Color;

public class Feuer {

	public static final int R = 0;
	public static final int G = 1;
	public static final int B = 2;

	public static final int WIDTH = 200;
	public static final int HEIGHT = 150;

	public static void main(String[] args) {

		ImageFrame frame = new ImageFrame("Feuer");

		Color[][] colors = new Color[WIDTH][HEIGHT];

		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				colors[i][j] = Color.BLACK;
			}
		}

		while (true) {
			for (int x = 0; x < WIDTH; x++) {
				if (Math.random() < 0.2) {
					colors[x][0] = new Color(255 , 165, 0);
				} else if (Math.random() < 0.3) {
					colors[x][0] = Color.YELLOW;
				} else if (Math.random() < 0.4) {
					colors[x][0] = Color.RED;
				} else if (Math.random() < 0.6) {
					colors[x][0] = new Color(128, 0, 128);	
				} else {
					colors[x][0] = Color.BLACK;
				} 
			}
		    // Распространение пламени
		    for (int y = 1; y < HEIGHT; y++) {
		        for (int x = 1; x < WIDTH - 1; x++) {

		            // Получение компонентов RGB у соседних пикселей
		            int red1 = colors[x - 1][y - 1].getRed();
		            int red2 = colors[x][y - 1].getRed();
		            int red3 = colors[x + 1][y - 1].getRed();
		            int red4 = colors[x][y].getRed();

		            int green1 = colors[x - 1][y - 1].getGreen();
		            int green2 = colors[x][y - 1].getGreen();
		            int green3 = colors[x + 1][y - 1].getGreen();
		            int green4 = colors[x][y].getGreen();

		            int blue1 = colors[x - 1][y - 1].getBlue();
		            int blue2 = colors[x][y - 1].getBlue();
		            int blue3 = colors[x + 1][y - 1].getBlue();
		            int blue4 = colors[x][y].getBlue();

		            // Средневзвешенные значения компонентов
		            int newRed = (int) Math.min(255, ((red1 + red2 + red3 + red4 * 4) / 7));
		            int newGreen = (int) Math.min(255, ((green1 + green2 + green3 + green4 * 4) / 7));
		            int newBlue = (int) Math.min(255, ((blue1 + blue2 + blue3 + blue4 * 4) / 7));

		            // Установка нового цвета
		            colors[x][y] = new Color(newRed, newGreen, newBlue);
		        }
		    }

			ImageFrame.drawArray(colors);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

