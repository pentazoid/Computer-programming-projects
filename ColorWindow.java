import javax.swing.*; //needed for swing classes
import java.awt.*; //needed for color class
import java.awt.event.*; //needed for event listener interface
/**
 * This class demonstrates how to set background color
 * of a panel and foreground color of a label
 * @author Pentazoid
 *
 */
public class ColorWindow extends JFrame {
private JLabel messageLabel; //display message
private JButton redButton; //changes color to red
private JButton blueButton; //changes color to blue
private JButton yellowButton; //changes color to yellow
private JPanel panel; //panel holds components
private final int WINDOW_WIDTH=200;//window width
private final int WINDOW_HEIGHT=125;//window height

/**
 * constructor
 * 
 * 
 */
public ColorWindow()
{
	//set the title bar text
	super("Color");
	//set the size of window
	setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
	//specific an action for the close button
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//create a label
	messageLabel=new JLabel("Click a button to"+
                            "select a color");
	//create the three buttons
	redButton=new JButton("Red");
	yellowButton=new JButton("Yellow");
	blueButton=new JButton("Blue");
	
	//Register an event listner with all 3 buttons
	redButton.addActionListener(new RedButtonListener());
	blueButton.addActionListener(new BlueButtonListener());
	yellowButton.addActionListener(new YellowButtonListener());
	
	//create apanel and add the components to it
	panel=new JPanel();
	panel.add(messageLabel);
	panel.add(blueButton);
	panel.add(redButton);
	panel.add(yellowButton);
			
	//add panel to the content pane
	add(panel);
	//display the window
	setVisible(true);}
	/**
	 * private inner class that handles the event
	 * when user clicks the red button
	 * 
	 */
	private class RedButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			//set the panels background to red
			panel.setBackground(Color.RED);
			//set the labels text to blue
			messageLabel.setForeground(Color.GREEN);
		}
		
	}
	
	/**
	 * private innerclass that handles event
	 * when user clicks yellow button
	 * @param args
	 */
	private class YellowButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//set panel to background color  yellow
			panel.setBackground(Color.YELLOW);
			//set the label text  to blue
			messageLabel.setForeground(Color.RED);
		}
	}
	
	private class BlueButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//set panel to background color blue
			panel.setBackground(Color.blue);
			//set label text to green
			messageLabel.setForeground(Color.BLACK);
		}
	}
	
	
	
	
	



public static void main(String[] args) {
	new ColorWindow();

}
}