package Wednesday108;

import java.util.Scanner;

public class Question3 {
    void checkAssetsVsLiabilities(int assets, int liabilities)
    {
        if (assets > liabilities) {
            System.out.println(" Assets are greater than liabilities.");
        } else if (assets == liabilities) {
            System.out.println("️ Assets are equal to liabilities.");
        } else {
            System.out.println(" Assets are less than liabilities.");
        }
    }

    public static void main(String[] args) {

        // 2️⃣ Create object of the class
        Question3 ac = new Question3();

        // 3️⃣ Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // 4️⃣ Ask user to enter assets and liabilities
        System.out.print("Enter total Assets: ");
        int assets = input.nextInt();

        System.out.print("Enter total Liabilities: ");
        int liabilities = input.nextInt();

        // 5️⃣ Display entered values
        System.out.println("\nEntered Assets: " + assets);
        System.out.println("Entered Liabilities: " + liabilities + "\n");

        // 6️⃣ Call method to check assets vs liabilities
        ac.checkAssetsVsLiabilities(assets, liabilities);

        // 7️⃣ Close Scanner
        input.close();
    }
}
