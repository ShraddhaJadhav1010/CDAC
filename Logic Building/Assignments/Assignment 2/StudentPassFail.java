import java.util.Scanner;

public class StudentPassFail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the grade for subject 1: ");
        int grade1 = scanner.nextInt();

        System.out.print("Enter the grade for subject 2: ");
        int grade2 = scanner.nextInt();

        System.out.print("Enter the grade for subject 3: ");
        int grade3 = scanner.nextInt();

        int failCount = 0;

        switch (grade1 > 40 ? 1 : 0) {
            case 0:
                failCount++;
                
                switch (failCount) {
                    case 1:
                        System.out.println("Subject 1: Fail");
                        break;
                    default:
                        System.out.println("Unexpected fail count.");
                        break;
                }
                break;
            case 1:
               
                break;
        }

     
        switch (grade2 > 40 ? 1 : 0) {
            case 0:
                failCount++;
                
                switch (failCount) {
                    case 2:
                        System.out.println("Subject 2: Fail");
                        break;
                    default:
                        System.out.println("Unexpected fail count.");
                        break;
                }
                break;
            case 1:
               
                break;
        }

    
        switch (grade3 > 40 ? 1 : 0) {
            case 0:
                failCount++;
           
                switch (failCount) {
                    case 3:
                        System.out.println("Subject 3: Fail");
                        break;
                    default:
                        System.out.println("Unexpected fail count.");
                        break;
                }
                break;
            case 1:
                // Pass, no action needed
                break;
        }

       
        switch (failCount) {
            case 0:
                System.out.println("The student passes all subjects.");
                break;
            default:
                System.out.println("The student failed in " + failCount + " subject(s).");
                break;
        }

        scanner.close();
    }
}