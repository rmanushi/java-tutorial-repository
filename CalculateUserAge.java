import javax.swing.JOptionPane;
public class CalculateUserAge
{
	public static void main(String[] args) 
	{//Setting first variables.
		String userName, askYearOfBirth;
	 //Asking for user input.
		userName = JOptionPane.showInputDialog("What is your name?");
		System.out.println(userName);
		askYearOfBirth = JOptionPane.showInputDialog("What year were you born?");
		System.out.println(askYearOfBirth);
		int yearOfBirth = Integer.parseInt(askYearOfBirth);
	 //Calculaitng user age.	
		int age = 2019 - yearOfBirth;
		String finalMessage = JOptionPane.showInputDialog("Hi "+ userName + " ,you are " + age + " years old.");
		System.out.println(finalMessage);
	}
}