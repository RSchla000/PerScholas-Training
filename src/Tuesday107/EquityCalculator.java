package Tuesday107;

import java.util.Scanner;

public class EquityCalculator {
    int calculateEquity (int assets, int liabilities){

        return assets - liabilities;
    }



    static void main(String[] args) {
        EquityCalculator ec = new EquityCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total assets: ");
        int assets = scanner.nextInt();
        System.out.println("Enter total liabilities: ");
        int liabilities = scanner.nextInt();
        int equity = ec.calculateEquity(assets,liabilities);
        System.out.println("Calculated equity = "+ equity);
        scanner.close();
    }
}
