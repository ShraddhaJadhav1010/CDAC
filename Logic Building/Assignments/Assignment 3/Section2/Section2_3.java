public class Section2_3 {
 public static void main(String[] args) {
 int count = 0;
	 while (count < 5) {
	 System.out.print(count + " ");
	 count++;
		if (count == 3) 
		break;
 }
 System.out.println(count);
 }
}
// Guess the output of this while loop. 
/*
	iteration 1
	count=0
	o<5 true
	print 0_
	count 1
	if condition false(0!=3)
	break
	o/p: 0_
	
	iteration  2
	count=1
	1<5 true
	print 1_
	count 2
	if condition false(1!=3)
	break
	o/p:0_1_
	
	iteration 3
	count=2
	2<5 true
	print 0_1_2
	count 3
	if condition false(2!=3)
	break
	o/p: 0_1_2_
	
	iteration 4
	count=3
	3<5 true
	print 0_1__2_3
	count 4
	if condition false(3==3)
	Final SOP Statement print: 0_1__2_3
	
*/