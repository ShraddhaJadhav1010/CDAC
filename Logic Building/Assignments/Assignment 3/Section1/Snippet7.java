public class Snippet7 {
 public static void main(String[] args) {
 int count;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
}
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop
//variable properly?

/*
	In this code count is only declared not be initialised.
	so we have to initilised the variable count.
	int count=0;
*/