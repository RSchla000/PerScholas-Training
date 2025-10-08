package Wednesday108;

import java.util.Scanner;

public class Question5 {
        int calculateEquity(int assets, int liabilities){
            return assets - liabilities;
        }
        void displayAccountingEquation(int assets, int liabilities, int equity){
            System.out.println("Accounting Equation: Assets = Liabilities + Equity");
            System.out.println(assets + "=" + liabilities + "+" + equity);
        }
        void checkAssetsVsLiabilities(int assets, int liabilities){
            String result = (assets > liabilities)? "Assets are greater than Liabilities":"Assets are not greater then Liabilities";
            System.out.println(result);
        }
        void checkEquityStatus(int equity){
            String equityStatus = (equity > 0)?"Equity is positive":"Equity is negative";
            System.out.println(equityStatus);
        }

        static void main(String[] args) {
            Question5 alp = new Question5();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter total number of assets:");
            int assets = scanner.nextInt();
            System.out.println("Enter total number of liabilities:");
            int liabilities = scanner.nextInt();
            int equity = alp.calculateEquity(assets,liabilities);
            System.out.println("Step 1: Calculated Equity = "+equity);
            System.out.print("Step 2");
            alp.displayAccountingEquation(assets,liabilities,equity);
            System.out.println("Step 3");
            alp.checkAssetsVsLiabilities(assets,liabilities);
            System.out.println("Step 4");
            alp.checkEquityStatus(equity);

            scanner.close();
        }
    }