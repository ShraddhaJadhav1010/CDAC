//Write a program to print the Fibonacci sequence up to the number 21. 
public class Q5 
{
    public static void main(String[] args)
	{

       
        int no1=0,no2=1;
		System.out.print("Fibonacci Series:");        
		for (int i = 1; i <= 21; ++i) 
		{
		System.out.print(no1 + " ");
		int sum = no1 + no2;
		no1 = no2;
		no2 = sum;
		}

    }

}