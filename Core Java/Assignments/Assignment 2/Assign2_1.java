import java.util.*;
public class Assign2_1 
 {

    public static void main(String[] args) {
//Using if-else
  /*   
    Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0&&year%100!=0)
        {
            System.out.println(year+" is a leap year.");
         }
        else if(year%400==0)
        {
            System.out.println(year+ "is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year.");
        }
 */


//Using Switch case:
    int year=1900;
    int temp=year%100;
    int count= 0;
    if(temp==0)
    {
        count=1;
    }
    switch(count){
        case 1:if(year%400==0){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
        break;
        case 0:
            if(year%4==0)
            System.out.println("it is a leap year");
            else
            System.out.println("it is not a leap year");
        break;
    }
    }
    
}