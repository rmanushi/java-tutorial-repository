import java.lang.Math;
import java.util.Scanner;
public class SolveQuadratic
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("This is a program than can solve quadratic equations of the form ax^2+bx+c=d.");
		System.out.println("Enter value for a.");
		double a = scan.nextDouble();
		System.out.println("Enter value for b.");
		double b = scan.nextDouble();
		System.out.println("Enter value for c.");
		double c = scan.nextDouble();
		System.out.println("Enter value for d.");
		double d = scan.nextDouble();
		double discriminant= (double)Math.pow(b,2)-4*a*(c-d);
		System.out.println(discriminant);
		if (discriminant>0)
		{
			double soluntion1 = (double)(-b+Math.sqrt(discriminant))/(2*a);
			double soluntion2 = (double)(-b-Math.sqrt(discriminant))/(2*a);
			System.out.println("There are 2 solutions, which are "+soluntion1+" and "+soluntion2+".");
		}
		else if (discriminant==0)
		{
			double solution = (double)(-b)/(2*a);
			System.out.println("There is only one solution which is "+solution+".");
		}
		else
		{
			System.out.println("There is no solution.");
		}

		
	}
}