import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Piece {

	private int x,y, gravity, gDelay, softDropSpeed, pieceID, rotationState;
	private boolean left, right, down, sKey, dKey;
	private int[] xPoints;
	private int[] yPoints;
	private int[] levelGravity = new int[]{45,40,35,30,25,20,15,10,8,5,4,4,4,3,3,3,2,2,2,1,1,1,1,1,1,1,1,1,1,0};
	PieceData pData;
	
	public Piece() {
		
		pData = new PieceData();
		
		pData.setNext();
		
		pieceID = (int) (Math.random() * 18);
		
		rotationState = 1;
		
		x = 5;
		y = 2;
		
		xPoints = pData.getRotationX(x,pieceID,rotationState);
		yPoints = pData.getRotationY(y,pieceID,rotationState);
		
		softDropSpeed = 1;
		gDelay = 0;
		gravity = 50;
		
		
		
	}
	
	public void initPos() {
		
		
		pieceID = pData.getNext();
		pData.setNext();
		rotationState = 1;
		x = 5;
		y = 2;
		
		xPoints = pData.getRotationX(x,pieceID,rotationState);
		yPoints = pData.getRotationY(y,pieceID,rotationState);
		gDelay = 0;
		
		
		
	}
	
	public boolean gameOver(int[][] theGrid) {
		boolean gameOver = false;
		if(theGrid[x][y] > 0) {
			gameOver = true;
		}
		for(int i = 0; i < 4; i++) {
			if(theGrid[xPoints[i]][yPoints[i]] > 0) {
				gameOver = true;
			}
		}
		
		return gameOver;
		
	}
	
	public void checkMove(int[][] theGrid) {
		
		if(left) {
			int wall = 0;
			
				if(x > 0) {
					if(theGrid[x-1][y] > 0) {
						wall++;
					} 
					
					
				} else { wall++; }
				
				for(int i = 0; i < 4; i++) {
					if(xPoints[i] > 0) {
					if(theGrid[xPoints[i]-1][yPoints[i]] > 0) {
						wall++;
					}
					} else { wall++; }
				}
				
			
			
			if(wall == 0) {
				
			x--;
			for(int i = 0; i < 4; i++) {
				xPoints[i]--;
			}
			
			}
		
			left = false;
		}
		
		
		if(right) {
			
			int wall = 0;
			
			if(x < 9) {
				if(theGrid[x+1][y] > 0) {
					wall++;
				} 
				
				
			} else { wall++; }
			
			for(int i = 0; i < 4; i++) {
				if(xPoints[i] < 9) {
				if(theGrid[xPoints[i]+1][yPoints[i]] > 0) {
					wall++;
				}
				} else { wall++; }
			}
			
		
		
		if(wall == 0) {
			
		x++;
		for(int i = 0; i < 4; i++) {
			xPoints[i]++;
		}
		
		}
	
		right = false;
			
		}
		
		if(dKey) {
			
			int[] buildx = pData.getRotationX(x, pieceID, rotationState + 1);
			int[] buildy = pData.getRotationY(y, pieceID, rotationState + 1);
			boolean OB = false; //OB means out of bounds.
			boolean grid = false;
			for(int i = 0; i < 4; i++) {
				if(buildx[i] < 0 || buildx[i] > 9 || buildy[i] > 21) {
					OB = true;
				}
				
			}
			if(!OB) {
				
					for(int i = 0; i < 4; i++) {
						if(theGrid[buildx[i]][buildy[i]] > 0) {
							grid = true;
						}
					}
					
					if(!grid) {
						xPoints = buildx;
						yPoints = buildy;
						rotationState++;
						playSound("file:./Resources/Turn.wav", 0);
					}
				
			}
			
			dKey = false;
			
		}
		
		if(sKey) {
			if(rotationState == 1) {
				rotationState += 4;
			}
			int[] buildx = pData.getRotationX(x, pieceID, rotationState - 1);
			int[] buildy = pData.getRotationY(y, pieceID, rotationState - 1);
			boolean OB = false; //OB means out of bounds.
			boolean grid = false;
			for(int i = 0; i < 4; i++) {
				if(buildx[i] < 0 || buildx[i] > 9 || buildy[i] > 21) {
					OB = true;
				}
				
			}
			if(!OB) {
				
					for(int i = 0; i < 4; i++) {
						if(theGrid[buildx[i]][buildy[i]] > 0) {
							grid = true;
						}
					}
					
					if(!grid) {
						xPoints = buildx;
						yPoints = buildy;
						rotationState--;
						playSound("file:./Resources/Turn.wav", 0);
					}
				
			}
			
			sKey = false;
			
		}
		
		
		
		
		
	}
	
	public void keyPressed(int k) {
		
		if(k == KeyEvent.VK_LEFT) {
			
			left = true;
			
		}
		
		if(k == KeyEvent.VK_RIGHT) {
			
			right = true;
			
		} 
		
		if(k == KeyEvent.VK_S) {
			
			sKey = true;
		}
		
		if(k == KeyEvent.VK_D) {
			
			dKey = true;
			
		} 
		
		
		if(k == KeyEvent.VK_DOWN) {
			
			down = true;
			
		}
		
		
		
		
	}
	
	public void keyReleased(int k) {
		
		if(k == KeyEvent.VK_DOWN) {
			down = false;
		}
		
		
		
	}
	
	public void gravity() {
		
		
		
		
		
		
			
		
			
			if((down && gDelay >= softDropSpeed) || gDelay >= gravity) {
			
			y++;
			for(int i = 0; i < 4; i++) {
				yPoints[i]++;
			}
			gDelay = 0;
			
			
		
			
			}
			
			else { gDelay++; }
		
		
		
		
		
	}
	
	public boolean drop(int[][] gridGrid) {
		
		
		if((down && gDelay >= softDropSpeed) || gDelay >= gravity) {
			
		if(y > 20) {
			return true;
		}
		for(int i = 0; i < 4; i++) {
			if(yPoints[i] > 20) {
				return true;
			}
		}
		
		if(gridGrid[x][y+1] > 0) {
			return true;
		}
		for(int i = 0; i < 4; i++) {
			if(gridGrid[xPoints[i]][yPoints[i]+1] > 0) {
				return true;
			}
		}
		
		}
		
		
		
		return false;
		
	}
	
	public int gravityTime() {
		return gravity;
	}
	
	public int gravityDelayTime() {
		return gDelay;
	}
	
	public int getPieceID() {
		return pieceID;
	}
	
	
	public void setGravity(int level) {
		if(level >= levelGravity.length) {
			gravity = 0;
		} else { gravity = levelGravity[level];}
	}
	
	
	public void draw(Graphics2D g) {
		
		
		g.setColor(Color.GREEN);
		if(pieceID % 3 == 1) {
			g.setColor(new Color(0,200,200));
		}
		if(pieceID % 3 == 2) {
			g.setColor(Color.LIGHT_GRAY);
		}
		
		
		g.fillRect(200 + (x * 17),10 + (y * 17), 16, 16);
		for(int i = 0; i < 4; i++) {
			
			
			
			
			
			
			g.fillRect(200 + (xPoints[i] * 17),10 + (yPoints[i] * 17), 16, 16);
			
		}
		
		
		int[] buildx = pData.getRotationX(0, pData.getNext(), 1);
		int[] buildy = pData.getRotationY(0, pData.getNext(), 1);
		
		
		g.setColor(Color.GREEN);
		if(pData.getNext() % 3 == 1) {
			g.setColor(new Color(0,200,200));
		}
		if(pData.getNext() % 3 == 2) {
			g.setColor(Color.LIGHT_GRAY);
		}
		
		g.fillRect(450,300, 16, 16);
		for(int i = 0; i < 4; i++) {
			g.fillRect(450 + (buildx[i] * 17),300 + (buildy[i] * 17), 16, 16);
		}
		
		
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int[] getXpoints() {
		return xPoints;
	}
	public int[] getYpoints() {
		return yPoints;
	}
	
	public void playSound(String soundFile, int times) {
		
		try {
			
			URL soundLocation = new URL(soundFile);
			AudioInputStream audio = AudioSystem.getAudioInputStream(soundLocation);
			Clip clip = AudioSystem.getClip();
			clip.open(audio);
			clip.loop(times);
			clip.start();
			
		} catch (UnsupportedAudioFileException uae) {
			System.out.println(uae);
		} catch(IOException ioe) {
			System.out.println(ioe);
		} catch(LineUnavailableException lue) {
			System.out.println(lue);
		}
		
	}
	
}
