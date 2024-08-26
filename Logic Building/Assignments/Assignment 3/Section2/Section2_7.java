public class Section2_7{
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = ++a * b-- - --a + b++;
 System.out.println(result);
 }
}
// Guess the output of this code snippet. 
/*
	Here
	++10 * 5-- - --10 + 5++
	11 * 5-- - --11 + 5++ <=pre increment step
	11	* 4	-	10	+	4++
	(11*5(before increment value of b)
	55	-	10 	+	4++
	55	-	10	+	5	<=post increment
	   55	-	4
	   49
	   
	   OUTPUT: 49
	   
	   
*/