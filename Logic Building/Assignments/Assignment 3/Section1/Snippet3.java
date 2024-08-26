public class DoWhileIncorrectCondition
 {
 public static void main(String[] args) 
{
 int num = 0;
 do
 { 
System.out.println(num); 
num++; 
} while (num > 0); 
} }
/*Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop?
ANS: 
In this program num is greater than 0.
 So at that condition it goes infinite time,
 So overcome this problem we have to take: while(num<0) . 
 This condition will satisfied and get ouput 0.
*/