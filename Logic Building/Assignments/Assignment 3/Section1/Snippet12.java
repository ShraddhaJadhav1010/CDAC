public class Snippet12 {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
}
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope
/*
	Here x is declared inside the loop. So this local variable only access in a for loop . not access outside the loop. When execution of program 
	completed that time this x variable can not be used. So the scope of the x will be out.
	For overcome this problem we have to declare x outside the loop.
	public class Snippet12 {
	 public static void main(String[] args) {
	 int x = i * 2;
	 for (int i = 0; i < 5; i++) {
	 }
	 System.out.println(x); // Error: 'x' is not accessible here
	 }
	}
	
*/