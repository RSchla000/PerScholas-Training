package Friday103;

import java.util.Scanner;

public class Q8LeapYearDetector {
    static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = number.nextInt();

        boolean isLeapYear;
        if (( year%4 == 0 && year %100 != 0) || (year% 400 == 0)) {
            isLeapYear = true;
        }else {
            isLeapYear = false;
        }
        if(isLeapYear) {
            System.out.println(year + "is a leap year");
        }else{
            System.out.println(year + "is not a leap year");
        }
        number.close();
    }
}
