import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;


public class GamePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	//FIELDS
	private BufferedImage image;
	private Graphics2D g;
	private boolean gameOver;
	
	//ENT
	private Piece thePiece;
	private Grid theGrid;
	private HUD theHUD;
	
	
	
	
	
	private boolean running;
	private MyKeyListener keyL;
	
	
	public GamePanel() {
		
		
		init();
		this.setFocusable(true);
		this.requestFocus();
		
		
		
		
		
	}
	
	
	public void init() {
		
		keyL = new MyKeyListener();
		this.addKeyListener(keyL);
		
		
		thePiece = new Piece();
		theGrid = new Grid();
		theHUD = new HUD();
		
		
		
		image = new BufferedImage(PentrisMain.WIDTH, PentrisMain.HEIGHT, BufferedImage.TYPE_INT_RGB);
		
		g = (Graphics2D) image.getGraphics();
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		running = true;
		gameOver = false;
		
	}
	
	public void play() {
		playSound("file:./Resources/Title.wav", 63);
		while(running) {
			
			update();
			draw();
			repaint();
			
			try {
				Thread.sleep(1000/60);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
		
	}
	
	public void update() {
		
		
			thePiece.checkMove(theGrid.getGrid());
			thePiece.setGravity(theHUD.getLevel());
			
	
		
		if(thePiece.drop(theGrid.getGrid())) {
			
			theGrid.set(thePiece.getX(), thePiece.getY(), thePiece.getXpoints(), thePiece.getYpoints(), thePiece.getPieceID());
			playSound("file:./Resources/Land.wav", 0);
			
			
			theHUD.incrementScore(theGrid.checkLine());
			if(theHUD.levelUp()) {
				playSound("file:./Resources/Level Up.wav", 0);
			}
			
			thePiece.initPos();
			if(thePiece.gameOver(theGrid.getGrid())) {
				
				
				gameOver = true;
				playSound("file:./Resources/Lose.wav", 0);
			}
			
			
			
		} else {
			
			thePiece.gravity();
			
		}
		
	}
	public void drawGameOver() {
		System.out.println("Draw!");
			g.setColor(Color.BLACK);
				
			g.setFont(new Font("Courier New",Font.BOLD, 20));
				
			g.drawString("GAME OVER", 30 , 100);
	}
	
	public void draw() {
		
		g.setColor(new Color(255,150 - (theHUD.getLevel() * 4),0));
		g.fillRect(0,0,PentrisMain.WIDTH,PentrisMain.HEIGHT);
		
		theHUD.draw(g);
		theGrid.draw(g);
		thePiece.draw(g);
		
		if(gameOver) {
			theHUD.drawGameOver(g);
			running = false;
		}
		
		
		
	}
	
	
	
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(image, 0, 0, PentrisMain.WIDTH, PentrisMain.HEIGHT, null);
		
		g2.dispose();
		
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
	
	public class MyKeyListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			thePiece.keyPressed(e.getKeyCode());
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			thePiece.keyReleased(e.getKeyCode());
			
		}
		
		
		
		
		
		
	}
	
	
}
