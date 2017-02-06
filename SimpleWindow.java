import javax.swing.*; //needed for swing classes
/**
 * This program displays a simple window with a title
 * the application exits when user clicks the 
 * close button
 * @author Pentazoid
 *
 */
public class SimpleWindow {

	public static void main(String[] args) {
		final int WINDOW_WIDTH=350;//window width in pixels
		final int WINDOW_HEIGHT=250;
		
		//create a window with a title
		JFrame window=new JFrame("A simple window");
		//set size of the window
		window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		//SPECIFIC WHAT HAPPENS WHEN CLOSED BUTTON IS CLICKED
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//display the window
		window.setVisible(true);
	

	}

}
