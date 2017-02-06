import javax.swing.*;

/**
 * KiloConverter class displays a JFrame
 * that lets user enter a distance in kilometers.
 * when the calculate button is clicked,a dialog box
 * is displayed with distance converted to smiles
 * @author Pentazoid
 *
 */
public class KiloConverter extends JFrame {
	private JPanel panel; //referene a panel
	private JLabel messageLabel; //reference a label
	private JTextField kiloTextField; //references a text field
	private JButton calcButton; //reference a button
	private final int WINDOW_WIDTH=310;
	private final int WINDOW_HEIGHT=100;
	
	public KiloConverter(){
		//Call the JFrame constructor
		super("Kilometer Converter");
		//set the size of the window
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		//SPECIFIC WHAT HAPPENS WHEN CLOSE BUTTON IS CLICKED
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//build the panel and add it to the frame
		buildPanel();
		
		//add panel to the frame's content pane's
		add(panel);
		//display window
		setVisible(true);
	}
	/**
	 * the buildPanel methods adds a label, a text field
	 * ,and a button to a panel
	 * 
	 */
	
	private void buildPanel(){
		//Create a label to display instructions
		messageLabel=new JLabel("Enter a distance"+"in kilometters");
		//create a textfield 10 characters wide
		kiloTextField=new JTextField(10);
		//create a new button
		calcButton=new JButton("Calculate");
		
		//Create a JPanel object and let the panel
		//field reference it
		panel =new JPanel();
		//add the label, text, and button
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);}
		
		public static void main(String[] args){
			new KiloConverter();
		}
	}


