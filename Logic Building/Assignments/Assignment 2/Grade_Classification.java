/*
Question 1: Grade Classification
Write a program to classify student grades based on the following criteria:
 If the score is greater than or equal to 90, print "A"
 If the score is between 80 and 89, print "B"
 If the score is between 70 and 79, print "C"
 If the score is between 60 and 69, print "D"
 If the score is less than 60, print "F" 
*/

import java.util.Scanner;
	class Grade_Classification
	{
		public static void main(String args[])
		{
			int m1,m2,m3,total;
			float percentage;
			System.out.println("Enter 3 subject marks:");
			Scanner x=new Scanner(System.in);
			m1=x.nextInt();
			m2=x.nextInt();
			m3=x.nextInt();
			
			total=m1+m2+m3;
			System.out.println("Total="+total);
			
			percentage=total/3;
			System.out.println("Percentage of 3 subjects is:"+percentage);
				if(percentage>=90)
					System.out.println("Grade A");
					else
						if(percentage>80 && percentage<89)
						System.out.println("Grade B");
					else
						if(percentage>70 && percentage<79)
						System.out.println("Grade C");
					else
						if(percentage>60 && percentage<69)
						System.out.println("Grade D");
				else
					System.out.println("Grade F");
		}
	}