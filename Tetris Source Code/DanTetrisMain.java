import javax.swing.JFrame;


public class DanTetrisMain {
	
	public static final int WIDTH = 640, HEIGHT = 480;
	
	
	public static void main(String[] args) {
		
		int startLevel = 0;
		int startHeight = 0;
		
		JFrame frame = new JFrame("Tetris by Dan Kruse");
		GamePanel gPanel = new GamePanel(startLevel,startHeight);
		
		frame.setSize(WIDTH, HEIGHT);
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.add(gPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		new GamePanel(startLevel, startHeight);
		
		
		gPanel.play();
		
		
		//Update 1.1 adds...
		//   Level Selection
		//   Height Selection
		//   Hang at top for 90 frames (Can be cancelled by pressing down)
		//   Left to Right DAS and Auto Repeat Rate (Improvement in controls)
		//   Hard Drop (Press Space)
		
		
		
		
	}
	
	
}
