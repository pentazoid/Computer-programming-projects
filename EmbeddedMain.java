import javax.swing.*;//needed for swing classes
/**
 * This class inherits from the JFrame . Its constructor
 * displays a simple window with a title the application
 * exits when user clicks the close
 * @author Pentazoid
 *
 */
public class EmbeddedMain extends JFrame {
/**
 * Constructor
 */
	
	public EmbeddedMain(){
		//Call the JFrame constructor and pass title
		super("A Simple Window");
		final int WINDOW_WIDTH=350;
		final int WINDOW_HEIGHT=250;
		//set size of window
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		//SPECIFIC WHAT HAPPENS WHEN BUTTON IS CLICKED
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//display window
		setVisible(true);
	}
	/**
	 * main method creates an instance  the  EmdeddedMain class
	 * s
	 * @param args
	 */
	public static void main(String[] args){
		EmbeddedMain main=new EmbeddedMain();
	}
}
