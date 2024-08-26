//Write a program to calculate the sum of the digits of the number 9876. The output should be
30 (9 + 8 + 7 + 6). 
public class Q7   
{  
public static void main(String args[])  
{  
int no=9876,digit,sum=0;  
  
while(no>0)  
{  
   digit = no%10;  
sum=sum+digit;  
no = no/10;  
}  
System.out.println("Sum of Digits: "+sum);  
}  
} 