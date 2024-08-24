public class GreatestNo
{
	public static void main(String args[])
	{
		int num1,num2,num3;
		num1=10;
		num2=50;
		num3=40;
		if( num1 >= num2 && num1 >= num3)
            		System.out.println(num1 + " is the greatestnumber.");

        	else if (num2 >= num1 && num2 >= num3)
           		 System.out.println(num2 + " is the greatest number.");

       		 else
           		 System.out.println(num3 + " is the greatest number.");
	}
}