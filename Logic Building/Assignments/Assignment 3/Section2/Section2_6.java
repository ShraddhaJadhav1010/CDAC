public class Section2_6 {
 public static void main(String[] args) {
 int x = 5;
 int y = ++x - x-- + --x + x++;
 System.out.println(y);
 }
}
// Guess the output of this code snippet. 

/*
Initial Value:

1)Here x = 5
 then ++x:
2)++x is a pre-increment operation.
  x value increases by 1
	so x becomes 6
	So expression is 6 - x-- + --x + x++
3)Then x--:
	x-- is a post-decrement operation. 
	It uses the current value of x then decrease by 1.
	so x becomes 5 after the operation.
	So expression  is 6 - 6 + --x + x++.
4)Then --x:
	--x is a pre-decrement operation.
	So x value decrease by b.
	now x becomes 4.
	So expression  is 6 - 6 + 4 + x++.
	
5) Then x++:

	x++ is a post-increment operation.
	It uses the current value of x then increase by 1.
	so x becomes 5 
	The expression is 6 - 6 + 4 + 4.


	y = 6 - 6 + 4 + 4
	y = 0 + 4 + 4
	y = 8
*/
