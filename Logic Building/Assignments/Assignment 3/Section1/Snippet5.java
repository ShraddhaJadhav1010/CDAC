public class Snippet5 {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i++) {
 System.out.println(i);
 }
 }
}
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the
//initialization and update statements in the `for` loop?
/*
	In this for loop i++ increases the value of i by 1 in each iteration,so its going infinite time .So for overcome this problem we have to decrease the i by 1.
	for(i=10;i>=0;i--)

*/