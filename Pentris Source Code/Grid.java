import java.awt.Color;
import java.awt.Graphics2D;


public class Grid {

	
	private int[][] grid;
	private int gridX, gridY;
	
	
	public Grid() {
		
		grid = new int[10][22];
		gridX = 200;
		gridY = 10;
		
		
		
		initGrid();
		
		
		
	}
	
	public void initGrid() {
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				
				
				grid[i][j] = 0;
				
			}
		}
		
		
	}
	
	public void set(int x, int y, int[] xPoints, int[] yPoints, int pieceID) {
		
		grid[x][y] = (pieceID % 3) + 1;
		for(int i = 0; i < 4; i++) {
			
			grid[xPoints[i]][yPoints[i]] = (pieceID % 3) + 1;
		}
		
		
	}
	
	public int checkLine() {
		
		int linesCleared = 0;
		int tilesInARow;
		
		for(int i = 0; i < 22; i++) {
			
			
			tilesInARow = 0;
			
			for(int j = 0; j < grid.length; j++) {
				
				if(grid[j][i] > 0) {
					tilesInARow++;
					
				}
				
			
			}
			
			
			if(tilesInARow == 10) {
				
				for(int clearJ = 0; clearJ < grid.length; clearJ++) {
					
					grid[clearJ][i] = 0;
					
				}
				
				
				for(int lineI = i - 1; lineI > 0; lineI--) {
					
					for(int lineJ = 0; lineJ < grid.length; lineJ++) {
						
						if(grid[lineJ][lineI] > 0) {
							
							grid[lineJ][lineI + 1] = grid[lineJ][lineI];
							grid[lineJ][lineI] = 0;
							
							
						}
						
						
						
					}
					
					
				}
				
				
				linesCleared++;
				
				
			}
			
			
		}
		
		
		
		return linesCleared;
		
		
		
		
		
	}
	
	
	
	
	public void draw(Graphics2D g) {
		
		
		g.setColor(Color.BLACK);
		g.fillRect(gridX - 1, gridY + 33, 171, 341);
		
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 2; j < grid[i].length; j++) {
				
				g.setColor(Color.DARK_GRAY);
				if(grid[i][j] > 0)
				{
					g.setColor(Color.GREEN);
					if(grid[i][j] == 2) {
						g.setColor(new Color(0,200,200));
					}
					if(grid[i][j] == 3) {
						g.setColor(Color.LIGHT_GRAY);
					}
					
				}
				
				
				
				g.fillRect(gridX + (17*i),gridY + (17*j),16,16);
				
			}
		}
		
		
		
		
		
	}
	
	
	public int[][] getGrid() {
		
		return grid;
		
	}
	
	
	
}
