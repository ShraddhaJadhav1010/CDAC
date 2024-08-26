/*9. Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/

public class Q19 {
    public static void main(String[] args) {
         for (int i=0;i<5;i++){
        int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+"");
                 num++;
                if(j<i){
                    System.out.print("*");
                }
            }
             System.out.println();
        }
    }
}