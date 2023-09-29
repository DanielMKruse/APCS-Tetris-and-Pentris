import javax.swing.JFrame;


public class PentrisMain {
	
	public static final int WIDTH = 640, HEIGHT = 480;
	
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Pentris");
		GamePanel gPanel = new GamePanel();
		
		frame.setSize(WIDTH, HEIGHT);
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.add(gPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		new GamePanel();
		
		gPanel.play();
		
		
		
		
		
		
		
	}
	
	
}
