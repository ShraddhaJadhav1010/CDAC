public class Snippet6 {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++)
 System.out.println(i);
 System.out.println("Done");
 }
}
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to
//include all statements within the loop

/*
	In this program, there is syntax error.which is for loop has a specific syntax for defining the loop.
	public class Snippet6 {
		 public static void main(String[] args) {
		 for (int i = 0; i < 5; i++)
		 {
		 System.out.println(i);
		 System.out.println("Done");
		 }
		}
	}	
*/