//Write a Java program to demonstrate the use of both pre-increment and post-decrement
//operators in a single expression 

public class Q11 {
     public static void main(String[] args) {
        int no1=4;
        int no2=11;
        
        
        int result=++no1+no2--;  
        
        
        System.out.println("Result " + result);
        System.out.println("Pre increment Value is: "+ no1); 
        System.out.println("Post decrement Value is: "+ no2); 
    }
}