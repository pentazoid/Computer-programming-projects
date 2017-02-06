import javax.swing.*;
/*
 * This class inherits from the JFrame class
 * Its constructor display a simple window with title
 * the application exits when the user clicks the close
 * button
 */
public class SimpleWindow2 extends JFrame {

	public SimpleWindow2(){
		//Call the JFrame constructor the
		//pass the title
		super("A Simple Window");
		final int WINDOW_WIDTH=350;
		final int WINDOW_HEIGHT=250;
		
		//SET SIZE OF WINDOW
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		//SPECIFY WHAT HAPPENS WHEN WINDOWS IS CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set visibility of women
		setVisible(true);
	}
}
