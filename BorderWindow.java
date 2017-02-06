import java.awt.*; //needed for borderLayout
import javax.swing.*;
public class BorderWindow extends JFrame {
	
	private final int WINDOW_WIDTH=400;
	private final int WINDOW_HEIGHT=300;
	
	/**
	 * CONSTRUCTOR
	 * @param args
	 */
	
	public BorderWindow(){
		//set the title bar text
		super("Border Layout");
		
		//set the size of window
		setSize(WINDOW_HEIGHT,WINDOW_WIDTH);
		
		//SPECIFIC what happens when close button clicked
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add a borderLayout manager to the content pane
		setLayout(new BorderLayout());
		//create five buttons
		JButton button1=new JButton("North Button");
		JButton button2=new JButton("South Button");
		JButton button3=new JButton("East Button");
		JButton button4=new JButton("West Button");
	    JButton button5=new JButton("Center Button");
	    //add the five buttons to the content pane
	    add(button1,BorderLayout.NORTH);
	    add(button2,BorderLayout.SOUTH);
	    add(button3,BorderLayout.EAST);
	    add(button4,BorderLayout.WEST);
	    add(button5,BorderLayout.CENTER);
	    
	    //display window
	    setVisible(true);
	}

	public static void main(String[] args) {
		new BorderWindow();

	}

}
