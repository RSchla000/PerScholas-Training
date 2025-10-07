package Tuesday107;

import java.util.Scanner;

public class AssetsCheckwithScanner {

    void checkAssetsVsLiabilities(int assets, int liabilities){
        String result = (assets > liabilities)?"Assets are greater then liabililties":"Assets are not greater then liabilities";
        System.out.println(result);
    }

    static void main(String[] args) {
        AssetsCheckwithScanner ac = new AssetsCheckwithScanner();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total assets: ");
        int assets = scanner.nextInt();
        System.out.println("Enter total liabilities: ");
        int liabilities = scanner.nextInt();
        ac.checkAssetsVsLiabilities(assets,liabilities);
        scanner.close();

    }
}
