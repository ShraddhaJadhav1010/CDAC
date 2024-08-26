public class Section2_5 {
 public static void main(String[] args) {
 int num = 1;
 for (int i = 1; i <= 4; i++) {
 if (i % 2 == 0) {
 num += i;
 } else {
 num -= i;
 }
 }
 System.out.println(num);
 }
}
// Guess the output of this loop
/*
here num=1
iteration 1
Here i%2==0 then 1%2==1 False
then num-=i so num= 1-1=0
num=0

iteration 2
Here i%2==0 then 1%2==0 True
then num+=i so num= 0+2=2
num=2

iteration 3
Here i%2==0 then 3%2==1 False
then num-=i so num= 2-3=-1
num=-1

iteration 4
Here i%2==0 then 4%2==2 True
then num+=i so num= -1+4=3
after completing 4 iteration 
output of num is 3.


*/