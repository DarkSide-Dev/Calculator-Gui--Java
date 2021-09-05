import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
		
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
		
		String operator = JOptionPane.showInputDialog("Enter the operation( + , - , x , / ): ");
		
		double result;
		
		switch(operator) {
		
			case "+":
				
				result = n1+n2;
				
				JOptionPane.showMessageDialog(null, n1+"+"+n2+"= "+result);
				
			break;
			
			case "-":
				
				result = n1-n2;
				
				JOptionPane.showMessageDialog(null, n1+"-"+n2+"= "+result);
				
			break;
			
			case "x":
				
				result = n1*n2;
				
				JOptionPane.showMessageDialog(null, n1+"x"+n2+"= "+result);
				
			break;
			
			case "/":
				
				result = n1/n2;
				
				JOptionPane.showMessageDialog(null, n1+"/"+n2+"= "+result);
				
			break;
		
		}
		

	}

}
