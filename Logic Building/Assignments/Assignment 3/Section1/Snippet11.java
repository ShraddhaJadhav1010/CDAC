public class Snippet11 {
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i += 2; // Error: This may cause unexpected results in output
 }
 }
}
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the
//desired result?
/*
	It will gives a desired output.. Because all the conditions are satisfied. It means in a in every iteration i increament by 2.
		so in, 1st iteration it print 0, then in 2nd iteration it prints 2, then in 3rd iteration it prints 4 and in a 4th iteration 
		condition will false. Because in a while loop i=6 and its greater than 5 so the condition become false.
		OUTPUT:
		0
		2
		4
*/