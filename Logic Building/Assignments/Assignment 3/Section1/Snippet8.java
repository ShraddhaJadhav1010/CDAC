public class Snippet8 {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num--;
 } while (num > 0);
 }
}
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the
//numbers from 1 to 5?
/*
	In this program we initialised a num=1, so when it eneterd in a loop it will decrease by 1 so its become 0 and after that it goes into the while loop it will check the condition 
	which is true. and prints only 1.
	For print the numbers 1 to 5 
	we have to take,
	int num = 1;
	do {
	System.out.println(num);
	num++;
	}while(num<=5);
*/