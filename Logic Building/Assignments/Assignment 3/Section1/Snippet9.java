public class Snippet9 {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i += 2) {
 System.out.println(i);
 }
 }
}
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update
//expression be corrected? 
/*
		This loop prints unexpected result. Because all the conditions are satisfied. It means in a 
		1st iteration it print 0, then in 2nd iteration it prints 2, then in 3rd iteration it prints 4 and in a 4th iteration 
		condition will false. Because in a for loop i=6 and its greater than 5 so the condition become false.
		OUTPUT:
		0
		2
		4
		

*/