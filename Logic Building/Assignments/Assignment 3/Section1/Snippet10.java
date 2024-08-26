public class Snippet10 {
 public static void main(String[] args) {
 int num = 10;
 while (num = 10) {
 System.out.println(num);
 num--;
 }
 }
}
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? 
/*
	EROOR: incompatible types: int cannot be converted to boolean
	It means that in a while loop we can not use = sign. Because is an assignment operator. In loop we have to give a realational oprator 
	such as < or <=.
	int num = 10;
	 while (num > 0) {
	 System.out.println(num);
	 num--;
 }
	
*/