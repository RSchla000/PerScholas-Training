package PA30341PracticeAssignmentControlFlow;

import java.util.Scanner;

public class ControlFlow06 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7");
        int dayNumber = input.nextInt();

        switch(dayNumber){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Choose between 1 and 7 please");
                break;
        }
        input.close();

    }
}
