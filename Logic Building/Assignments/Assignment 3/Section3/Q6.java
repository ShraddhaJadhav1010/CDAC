//Write a program to find and print the first 5 prime numbers. 
public class Q6 {
    public static void main(String[] args) {
        int i, j,count;

        System.out.println("Prime numbers between 0 to 5 :");
        for (i =0;i<=5;i++) {
            count=0;
            for(j=i;j>=1;j--) {
                if(i%j==0)
                    count=count+1;
            }
            if(count==2)
                System.out.print(""+i+" ");
        }
    }
}