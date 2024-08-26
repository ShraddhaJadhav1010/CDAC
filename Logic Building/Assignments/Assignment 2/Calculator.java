
import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{
	int a,b;
	Scanner x=new Scanner(System.in);
	
	System.out.println("1.Add");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("Enter 2 values:");
	
	a=x.nextInt();
	b=x.nextInt();
	//C=x.nextInt();
	System.out.println("Enter your choice:");
	int ch=x.nextInt();
	int C=0;
	switch(ch)
	{
		case 1:
			C=a+b;
			break;
		case 2:
			C=a-b;
			break;
		case 3:
			C=a*b;
			break;
			case 4:
				if(a==0 || b==0)
					System.out.println("Error: Divide by zero not possible");
				else
					C=a/b;
	}
		System.out.println("Result="+C);
	
	
	

   
	}
}