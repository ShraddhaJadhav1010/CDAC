public class Section2_2 {
 public static void main(String[] args) {
 int total = 0;
 for (int i = 5; i > 0; i--) {
 total += i;
 if (i == 3) continue;
 total -= 1;
 }
 System.out.println(total);
 }
}
// Guess the output of this loop. 
/*
iteration 1
total=0
i=5; 5>0
then total=0+5=5
then check condition which is 5!=3 then total=5-1=4
total=4

iteration 2
total=4
i=4; 4>0
then total =4+4=8
then condition 4!=3 then total=8-1=7
total=7

iteration 3
total=7
i=3; 3>0
then total =7+3=10
then condition 3==3 then continue block executed.
then skip the next statement.

iteration 4
total=10
i=2; 2>0
then total =10+2=12
then condition 2!=3 then total=12-1=11
total=11

iteration 5
total=11
i=1; 1>0
then total =11+1=12
then condition 1!=3 then total=12-1=11
Total=11

So output is 11

*/