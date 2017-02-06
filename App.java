import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		int value;
	   //E.g. 4!=4*3*2*1
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a value for factorial");
		value=keyboard.nextInt();
		try{
		System.out.println(calculate(value));}catch(NumberFormatException e){
			
			System.out.println("Invalid since number cannot be less than one");
			
		}

	}
	
	private static int calculate (int value) throws NumberFormatException{
		
		if(value<0) throw new NumberFormatException("invalid error. No negative numbers");
		if(value==1 || value==0){
			return 1;
		}
		return  calculate(value-1)*value;
	
	}
	
}


