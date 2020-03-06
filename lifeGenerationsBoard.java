import java.util.*;
import java.util.concurrent.TimeUnit;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JFrame; 
import javax.swing.JPanel;

public class lifeGenerationsBoard extends JPanel
{
	/* The universe of the Game of Life is an infinite, two-dimensional orthogonal grid of square cells, 
	 * each of which is in one of two possible states, alive or dead, (or populated and unpopulated, respectively
	 * Reference: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
	 */
	public static int[][] lifeBoard;
	public static int[][] lifeBoardTemp;
	static JFrame frame 			= new JFrame();
	static boolean usePreset 		= false; 					// If usePreset is false, then randomly generate a seed.
	static boolean debugLife 		= false; 					// Show Debug
	static int generationNum		= 0; 						// Generation counter
	static int delayTimeMs			= 1000; 					// Delay time between each repaint in milliseconds
	static int sizeNum 				= 8;						// Size of Matrix - 8 = int[8][8]
	static int blockSize 			= 60;						// Pixel Width/Height In Window representing each array value
	static int windowSize 			= (blockSize * sizeNum); 	// Size of blocks.
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// Random Seed Generation
		if(usePreset == false) {
			 lifeBoard = new int[sizeNum][sizeNum];
				//Two States Alive or dead = array state (1 or 0).
				Random rand = new Random();
				//Random Seed Generator - Comment out if preset is used
				for (int i = 0; i < lifeBoard.length; i++) {
					for (int j = 0; j < lifeBoard[0].length; j++) {
						lifeBoard[i][j] = rand.nextInt(2);
					}
				}
		} else {
		// Preset Seed
			
			lifeBoard = new int[][] 
			{
					{ 1, 1, 1, 1, 0, 0, 0, 0 },
					{ 1, 1, 1, 1, 0, 0, 0, 0 },
					{ 1, 1, 1, 1, 0, 0, 0, 0 },
					{ 1, 1, 1, 1, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 1, 1, 1, 1 },
					{ 0, 0, 0, 0, 1, 1, 1, 1 },
					{ 0, 0, 0, 0, 1, 1, 1, 1 },
					{ 0, 0, 0, 0, 1, 1, 1, 1 }
			};
		}
		framePaint();

		frame.getContentPane().add(new lifeGenerations());
		frame.setBounds(10, 10, windowSize , windowSize+25);
		frame.setTitle("Conway\'s Game Of Life");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tick();
	}
	
	public static void tick() {
		for (int i = 0; i < lifeBoard.length; i++) {
			for (int j = 0; j < lifeBoard.length; j++) {
				rulesChecker(i,j);
			}
		}

		framePaint();

		tick();
	}
	public static void framePaint() {

			frame.getContentPane().validate();
			frame.getContentPane().repaint(0, 0, windowSize , windowSize+25);
			try {
				TimeUnit.MILLISECONDS.sleep(delayTimeMs);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void paint(Graphics g){
		//Go through all pixel values and adjust it to Jframe representation.
		//setDoubleBuffered(false);
		for (int i = 0; i < lifeBoard.length; i++) {
			for (int j = 0; j < lifeBoard.length; j++) {
				if(lifeBoard[i][j] == 1) {
					g.setColor(Color.BLACK); //black if alive
				} else {
					g.setColor(Color.WHITE); //white if dead
				}
					g.fillRect(blockSize*i, blockSize*j, blockSize, blockSize);
			}
		}
		if (debugLife) {
			generationNum++;
			System.out.println("\n--------------");
			System.out.println("Step: #" + generationNum);
		}
	}
	

		public static void rulesChecker(int cellRow, int cellColumn) {
			//framePaint();
			int[] nCount = neighborLocator(cellRow, cellColumn);
			if(lifeBoard[cellRow][cellColumn] == 1) {
				// If cell is alive Live = 1, dead = 0
				//Any live cell with fewer than two live neighbors dies, as if by under-population.
				if (nCount[1] < 2) {
					//trigger Death
					lifeBoard[cellRow][cellColumn] = 0;
					rulesChecker(cellRow, cellColumn);
				}  
				// Any live cell with more than three live neighbors dies, as if by over-population.
				else if (nCount[1] > 3) {
					//trigger Death
					lifeBoard[cellRow][cellColumn] = 0;
					rulesChecker(cellRow, cellColumn);
				}
				//Any live cell with two or three live neighbors lives on to the next generation.
			} else {
				// cell is dead
				//Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
				if (nCount[1] == 3) {
					//Rebirth
					lifeBoard[cellRow][cellColumn] = 1;
					rulesChecker(cellRow, cellColumn);
				}
			}	

		}

		public static int[] neighborLocator(int cellRow, int cellColumn) {
			
			int[] neighborList = new int[(int)Math.pow(sizeNum, 2)];
			int[] nCount = new int[2];
			/*
			 * 
			 * You will also need a neighborlocator, that returns the locations of all neighbor cells (horizontally, vertically, or diagonally), 
			 * also has parameter count (with live/dead).

			Every cell interacts with its eight neighbors, which are the cells that are horizontally, vertically, or diagonally adjacent.
			It does not care where they are located, merely that they are alive or dead
			0 0 0 0 0 0 0 0
			1 1 1 1 1 1 1 1 
			2 2 2 2 2 2 2 2
			3 3 3 3 3 3[3]3
			4 4 4 4 4 4 4 4 
			5 5 5 5 5 5 5 5
			6 6 6 6 6 6 6 6
			7 7 7 7 7 7 7 7
			*/

			for (int i = 0; i < lifeBoard.length; i++) {
				// Find Vertical Neighbors, Add Boundaries, and add build neighbor location list.
				if(i != cellColumn) {
						neighborList[i] = lifeBoard[cellRow][i];
				}
				// Find Horizontal Neighbors, Add Boundaries, and add build neighbor location list.
				if(i != cellRow) {
						neighborList[i + lifeBoard.length] = lifeBoard[i][cellColumn];
				}
			}
			
			// each of these would need to be a for loop that starts at index of row + column and ends with limited row or column edge case.
			// Find Diagonal, Add Boundaries, and add build neighborlocation list.
			for (int i = 1; i <= lifeBoard.length; i++) {

				if ((cellRow-i >=0 && cellRow-i <sizeNum)) {
					if (cellColumn-i >=0 && cellColumn-i <sizeNum) {
						//Set 1 - Backward Diagonal -> int[m-1][n-1] (up to the left)
						Arrays.sort(neighborList);
						neighborList[Arrays.binarySearch(neighborList, 0)] = lifeBoard[cellRow-i][cellColumn-i];
					} 
					if ((cellColumn+i >=0 && cellColumn+i <sizeNum)) {
						// Set 2 - Forward Diagonal -> int[m-1][n+1] (down to the left)
						Arrays.sort(neighborList);
						neighborList[Arrays.binarySearch(neighborList, 0)] = lifeBoard[cellRow-i][cellColumn+i];
					} 
				} 
				if ((cellRow+i >=0 && cellRow+i <sizeNum)) {
					if (cellColumn+i >=0 && cellColumn+i <sizeNum) {
						//Set 1 - Backward Diagonal -> int[m+1][n+1] (down to the right)
						Arrays.sort(neighborList);
						neighborList[Arrays.binarySearch(neighborList, 0)] = lifeBoard[cellRow+i][cellColumn+i];
					}
					if (cellColumn-i >=0 && cellColumn-i <sizeNum) {
						// Set 2 - Forward Diagonal -> int[m+1][n-1] (up to the right)
						Arrays.sort(neighborList);
						neighborList[Arrays.binarySearch(neighborList, 0)] = lifeBoard[cellRow+i][cellColumn-i];
					}
				}
			}

			for (int i =0; i < neighborList.length;i++) {
				if (neighborList[i] == 1) {
					// Add To Live Cell - Count
					nCount[1]++;
				} else {
					// Add To Dead Cell - Count
					nCount[0]++;
				}	
			}

			if (debugLife) {
				System.out.println("int[" + cellRow + "][" + cellColumn + "] | Current Status: " + lifeBoard[cellRow][cellColumn] + "  | Live Neighbors - " + nCount[1] + " | Dead Neighbors - " + nCount[0]);
			}
			return nCount;
		}
}
	
