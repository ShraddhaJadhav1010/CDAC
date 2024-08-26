Snippet 8:
public class LoopIncrement {
 public static void main(String[] args) {
 int count = 0;
 for (int i = 0; i < 4; i++) {
 count += i++ - ++i;
 }
 System.out.println(count);
 }
}
// Guess the output of this code snippet.
/*
	iteration1 :
	i=0	
	i++ post increment
	current value of i is 0 then increses by 1.
	so expression is 0- ++i;
	then for i++
	i++ is a pre increment so it incremented by 1.
	so i becomes 2
	so expression 0-2
	then count +=0-2
	so count=-2.
	then in loop i will incremented. 
	So i=3
	
	Iteration 2
	i=3
	i++ post increment
	current value of i is 3 then increses by 1.
	so expression is 3- ++i;
	then for i++
	i++ is a pre increment so it incremented by 1.
	so i becomes 5
	so expression 3-5
	then count +=3-5
	so count=-2+-2=-4.
	then in loop i will incremented.
	so i=6 then loop will terminated.
	
	*/