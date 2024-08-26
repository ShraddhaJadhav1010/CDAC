//Write a program to reverse the digits of the number 1234. The output should be 4321. 

public class Q4   
{  
		public static void main(String[] args)   
		{  
			int num=1234,reverse=0;  
			while(num!=0)   
			{  
			int remainder = num%10;  
			reverse=reverse*10+remainder;  
			num=num/10;  
			}  
			System.out.println("The reverse number is:"+reverse);  
		}  
} 