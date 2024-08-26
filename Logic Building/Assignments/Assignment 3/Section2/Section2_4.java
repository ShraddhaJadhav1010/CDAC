public class Section2_4 {
 public static void main(String[] args) {
 int i = 1;
 do {
 System.out.print(i + " ");
 i++;
 } while (i < 5);
 System.out.println(i);
 }
}
// Guess the output of this do-while loop. 
/*
	iteration 1
	i=1
	condition check
	print 1_
	i increment by 2.
	
	iteration 2
	i=2
	condition check
	print 1_2_
	i increment by 1=3.
	
	iteration 3
	i=3
	condition check
	print 1_2_3_
	i increment by 1=4.
	
	iteration 4
	i=4
	condition check
	print 1_2_3_4
	i increment by 1=5 
	
	iteration 5
	i=5
	condition check
	print 1_2_3_4_5
	i increment by 1=6
	Condition false
	OUTPUT:1_2_3_4_5
*/