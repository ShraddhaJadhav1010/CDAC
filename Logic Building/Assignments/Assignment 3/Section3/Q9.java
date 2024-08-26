//Write a program to find and print the largest digit in the number 4825. 
public class Q9
{

    public static void main(String args[]) {
       // Scanner in = new Scanner(System.in);
       // System.out.print("Enter Number: ");
        int n =4825;
        int a =-1;
        while(n!=0) {
            int d =n%10;
            if(d>a)
                a = d;
            n=n/10;
        }
        System.out.println("Largest Digit is  "+a);
    }
}