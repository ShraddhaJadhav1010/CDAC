public class Snippet4 {
 public static void main(String[] args) {
 for (int i = 1; i <= 10; i++)
{
 System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
}
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the
//expected output? 
/*
ANS:
	In this program there is no problem. Program executed successfully.
	Output:
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10


*/