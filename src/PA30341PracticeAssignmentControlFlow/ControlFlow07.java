package PA30341PracticeAssignmentControlFlow;

import java.util.Scanner;

public class ControlFlow07 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Filing Status Options");
        System.out.println("1 - Single");

        System.out.println("Enter your filling status  (1-4):");

        int status = input.nextInt();
        System.out.println("Enter your taxable income : From $700 - $ 372950");
        double income = input.nextDouble();
        double tax = 0;

        switch (status){
            case 1:
                if(income <= 8350)
                    tax = income*0.10;
                else if (income <= 33950)
                    tax = 8350*0.10 + (income - 8350) * 0.15;
                else if (income <= 82250)
                    tax = 8350*0.10+(33950 - 8350)*0.15+(income-33950)*0.25;
                else if (income <= 171550)
                    tax = 8350 * 0.10 + (33950-8350)*0.15 + (82250-33950)*0.25 + (income-82250)*0.28;
                else if (income <= 372950)
                    tax = 8350 * 0.10 + (33950-8350)*0.15 + (82250-33950)*0.25 + (171550-82250)*0.28 + (income-171550)*0.33;
                else
                    tax = 8350 * 0.10 + (33950-8350)*0.15 + (82250-33950)*0.25 + (171550-82250)*0.28 + (372950-171550)*0.33 + (income-372950)*0.35;
                break;




            default:
                System.out.println("Invalid filing status.");
                System.exit(1);
                System.out.println("Your tax is: $"+tax);



        }
        }
    }