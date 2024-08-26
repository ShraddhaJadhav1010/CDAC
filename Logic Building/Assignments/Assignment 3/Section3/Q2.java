//Write a program to compute the factorial of the number 10.
public class Q2{  
 public static void main(String args[]){  
  int i,fact=1;  
  int num=10;    
  for(i=1;i<=num;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+num+" is:"+fact);    
 }  
}  
