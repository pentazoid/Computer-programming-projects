import javax.swing.*; //needed for swing classes
import java.awt.event.*; //need for event listener interface
import java.awt.*;
public class EventObject extends JFrame{
	private JButton button1; //button1
	private JButton button2; //button2
	private JButton button3; //button 3
	private JPanel panel; //a panel to hold components
	private final int WINDOW_WIDTH=300;
	private final int WINDOW_HEIGHT=80;

	
	/**
	 * CONSTURCTOR
	 */
	
	public EventObject(){
		//set title bar text
		super("Event Object Demonstration");
		//set the size of the window
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		//SPECIFY WHAT HAPPENS WHEN CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//create three buttons
		button1=new JButton("Button1");
		button2=new JButton("Button2");
		button3=new JButton("Button3");
		//register button with addEventListener
		button1.addActionListener(new ButtonListener());
		button2.addActionListener(new ButtonListener());
		button3.addActionListener(new ButtonListener());
		// Create a panel and add buttons to it
		panel=new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		//add the panel to the content pane
		add(panel);
		//display window
		setVisible(true);
	}
	/**
	 * private inner class that handles the event 
	 * when the user clicks a button
	 * @author Pentazoid
	 *
	 */
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//get the action command
			String actionCommand=e.getActionCommand();
			//determine which button was clicked and 
			//display a message
			if(actionCommand.equals("Button 1")){
				JOptionPane.showMessageDialog(button1, "You clicked button one");
				
			}else if(actionCommand.equals("Button 2")){
				JOptionPane.showMessageDialog(button2, "You clicked button two");
			}else if(actionCommand.equals("Button 3")){
				JOptionPane.showMessageDialog(button3, "You clicked button three");
			}
		}
	}
	
	public static void main(String[] args){
		new EventObject();
	}
}
