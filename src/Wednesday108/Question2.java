package Wednesday108;

import java.util.Scanner;

public class Question2 {

    void displayAccountingEquation(int assets, int liabilities, int equity) {
        System.out.println("\nAccounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);
    }

    public static void main(String[] args) {

        // 2️⃣ Create an object of the class
        Question2 ae = new Question2();

        // 3️⃣ Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // 4️⃣ Ask the user to enter assets, liabilities, and equity
        System.out.print("Enter total Assets: ");
        int assets = input.nextInt();

        System.out.print("Enter total Liabilities: ");
        int liabilities = input.nextInt();

        System.out.print("Enter total Equity: ");
        int equity = input.nextInt();

        // 5️⃣ Display the accounting equation using the method
        ae.displayAccountingEquation(assets, liabilities, equity);

        // 6️⃣ Check if the equation is balanced
        if (assets == (liabilities + equity)) {
            System.out.println("The equation is balanced.");
        } else {
            System.out.println("The equation is NOT balanced.");
        }

    }
}
