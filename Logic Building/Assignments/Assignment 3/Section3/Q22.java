/*
22. Write a program to print the following pattern:
*********
 *******
 *****
 ***
 *
 ***
 *****
 *******
*********
*/
public class Q22 {
    public static void main(String[] args) {
        int n=5;
			for (int i=n;i>0;i--) 
			{
				for (int j=0;j<n-i;j++) 
				{
                System.out.print(" ");
				}
					for (int k=0;k<(2*i-1);k++)
					{
						System.out.print("*");
					}
					System.out.println();
				}

						for (int i=2;i<=n;i++)
							{
								for (int j=0;j<n-i;j++)
									{
										System.out.print(" ");
									}
										for (int k=0;k<(2*i-1);k++)
											{
												System.out.print("*");
											}
											System.out.println();
			}
    }
}