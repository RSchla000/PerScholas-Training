package Friday103;

import java.util.Scanner;

public class Q6Question4Clock {
    static void main(String[] args) {
        Scanner clock = new Scanner(System.in);

        System.out.println("Enter a number of hours:");

        int hoursInput = clock.nextInt();

        int hoursonclock = hoursInput % 24;

        if (hoursonclock < 0) {
            hoursonclock += 24;
        }
        System.out.println("Hour on clock: " + hoursonclock);

        clock.close();
    }
}