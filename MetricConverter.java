import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * The MetricConverter class lets the user enter a distance
 * in kilometers. radio Btoons can be selected to convert 
 * the kilometers to miles, feet or inches
 * @author Pentazoid
 *
 */
public class MetricConverter extends JFrame{
	private JPanel panel; //a panel to hold components
    private JLabel messageLabel; //a message to hold user
    private JTextField kiloTextField; //to hold user input
    private JRadioButton milesButton; //miles conversion button
    private JRadioButton feetButton; //feet conversion button
    private JRadioButton inchesButton; //inches conversion button
    private ButtonGroup radioButtonGroup; //to group radio buttons
    private final int height=400;//window width
    private final int width=100; //window height
    /**
     * Constuctor
     * 
     * @param args
     */
    public MetricConverter(){
    	super("Metric Converter");
    	//set window parameters
    	setSize(height,width);
    	//specify close
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//buuild the panel method
    	buildPanel();
    	//add panel to frames content pane
    	add(panel);
    	//display window
    	setVisible(true);
    }
    
    /**
     * the buildPanel method add a label, text field , and
     * three radio buttons to a panel
     * @param args
     */
    private void buildPanel(){
    	//create the label, text field and radio Button
    	messageLabel=new JLabel("Enter a distance in km");
    	kiloTextField=new JTextField(10);
    	milesButton=new JRadioButton("Convert to miles");
    	feetButton=new JRadioButton("Convert to feet");
    	inchesButton=new JRadioButton("Convert to inches");
    	//group radioButtons
    	radioButtonGroup=new ButtonGroup();
    	radioButtonGroup.add(milesButton);
    	radioButtonGroup.add(feetButton);
    	radioButtonGroup.add(inchesButton);
    	
    	//add action listeners to the radio buttons
    	milesButton.addActionListener(new RadioButtonListener());
    	feetButton.addActionListener(new RadioButtonListener());
    	inchesButton.addActionListener(new RadioButtonListener());
    	//create a panel and add the components to panel
    	panel =new JPanel();
    	panel.add(messageLabel);
    	panel.add(kiloTextField);
    	panel.add(milesButton);
    	panel.add(feetButton);
    	panel.add(inchesButton);
    }
    
    /**
     * Private inner class that handles the event
     * when user clicks one of radio buttons
     * @param args
     */
    
    private class RadioButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e){
    		String input; //to hold input
    		String convertTo=""; //what we are converting to
    		double result=0.0; //to hold the coversion
    		//get input from the text field
    		input=kiloTextField.getText();
    		//determine the button that was clicked
    		//perform the selected conversion
    		if(e.getSource()==milesButton){
    			convertTo="miles";
    			result=Double.parseDouble(input)*.6214;    		}
    		
    		else if(e.getSource()==feetButton){
    		    convertTo="feet";
    		    result=Double.parseDouble(input)*3281.0;
    	}
    		
    		else if(e.getSource()==inchesButton){
    		    convertTo="inches";
    		    result=Double.parseDouble(input)*39970;
    	}
    		
    		//display converted distance
    		JOptionPane.showMessageDialog(null, input+"kilometers is"+result +convertTo);
    		
    	}
    	
    }
    
//main method creates an instance of the 
//MetricConverter class, causing it to display
//its window
	public static void main(String[] args) {
		new MetricConverter();
	}

}
