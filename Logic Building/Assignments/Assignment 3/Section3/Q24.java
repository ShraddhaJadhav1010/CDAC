/*Write a program to print the following pattern:
1
22
333
4444
55555
*/
public class Q24 {
    public static void main(String[] args) {
         for (int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
             System.out.println();
        }
    }
}