/*Write a program to print the following pattern

      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
  * * * * *
   * * * *
    * * *
     * *
      *
	  */
public class Q18 {
    public static void main(String[] args) {
         for (int i=0;i<5;i++){
         for(int space=i;space<=5;space++){
                    System.out.print(" ");    
                }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
             System.out.println();
        }
        for (int i=0;i<5;i++){
         for(int space=0;space<=i;space++){
                    System.out.print(" ");    
                }
            for(int j=5;j>i;j--){
                System.out.print(" *");
            }
             System.out.println();
        }
    }
}