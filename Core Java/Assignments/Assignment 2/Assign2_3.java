import java.util.Scanner;

public class Assign2_3 {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        age=sc.nextInt();
       if(age>=18)
       System.out.println("you can vote");
       else
       System.out.println("you can't vote");
    }
}
