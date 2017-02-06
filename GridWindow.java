import java.awt.*; //needed for GridLayout
import javax.swing.*;
public class GridWindow extends JFrame{
	private final int WINDOW_WIDTH=400;
	private final int WINDOW_HEIGHT=200;
	
	/**
	 * Constructor
	 * 
	 */
	
	public GridWindow(){
		//set the title bar text
		super("Grid Layout");
		//seet the size of the window
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		//SET SPECIFY AN ACTION FOR CLOSE BUTTON
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add a gridlayout manager to content pane
		setLayout(new GridLayout(2,3));
		//Create six buttons
		JButton button1=new JButton("Button 1");
		JButton button2=new JButton("Button 2");
		JButton button3=new JButton("Button 3");
		JButton button4=new JButton("Button 4");
		JButton button5=new JButton("Button 5");
		JButton button6=new JButton("Button 6");
		//add buttons to pane
		add(button1); //go in row 1, column 1
		add(button2); //go in row, column 2
		add(button3); //go in row 1 , column 3
		add(button4); //go into row 2, column 1
		add(button5); //go into row 2 , column 2
		add(button6); //go into row 2, column 3
		
		//display window
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		new GridWindow();

	}

}
