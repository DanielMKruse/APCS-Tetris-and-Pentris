import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class HUD {
	
	private int level, score, lines;
	
	public HUD(int startLevel) {
		
		level = startLevel;
		score = 0;
		lines = 0;
		
	}
	
	public void incrementScore(int linesAtOnce) {
		
		if(linesAtOnce == 1) { 
			score += 40*(level + 1);
			playSound("file:./Resources/Line Clear.wav", 0);
		}
		if(linesAtOnce == 2) { 
			score += 100*(level + 1);
			playSound("file:./Resources/Line Clear.wav", 0);
		}
		if(linesAtOnce == 3) { 
			score += 300*(level + 1);
			playSound("file:./Resources/Line Clear.wav", 0);
		}
		if(linesAtOnce == 4) { 
			score += 1200*(level + 1);
			playSound("file:./Resources/Tetris Clear.wav", 0);
		}
		
		if(score > 999999) {
			score = 999999;
		}
		
		
		lines += linesAtOnce;
		
		
		
	}
	
	public boolean levelUp() {
		
		if(level < 30 && lines >= (level + 1)*10) {
			level++;
			return true;
		}
		
		return false;
		
		
	}
	
	public void drawGameOver(Graphics2D g) {
		g.setColor(Color.WHITE);
		
		g.setFont(new Font("Courier New",Font.BOLD, 20));
		
		g.drawString("GAME OVER", 220 , 30);
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
	
	
	public int getLevel() {
		return level;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(400, 280, 100, 70);
		g.fillRect(380, 70, 200, 100);
		
		g.setColor(Color.WHITE);
		
		g.setFont(new Font("Courier New",Font.BOLD, 20));
		
		g.drawString("TETRIS", 30 , 30);
		g.drawString("By Dan Kruse", 30 , 60);
		
		g.drawString("Score: " + score, 400 , 100);
		g.drawString("Lines: " + lines, 400 , 130);
		g.drawString("Level: " + level, 400 , 160);
		g.drawString("NEXT", 400 , 270);
		
		
		
		
	}
	
	
	
	
}
