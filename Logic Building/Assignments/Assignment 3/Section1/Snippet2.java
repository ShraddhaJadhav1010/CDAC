public class Snippet2 
{
 public static void main(String[] args) {
 int count = 5; 
while (count = 0)
 { System.out.println(count); 
count--;
 }
 }
 } 
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the `while` loop?
/*ANS: 
int cannot be converted to Boolean that’s why the loop not execute as expected. You can take either true or false in while. It doesn’t take 0 and 1.
 while (count = 0)
*/