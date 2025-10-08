package Wednesday108;

import java.util.Scanner;

public class Question4 {

    void checkEquityStatus(int equity){
        String equityStatus = (equity > 0)?"Equity is positive":"Equity is negative";
        System.out.println(equityStatus);
    }

    static void main(String[] args) {
        Question4 esc = new Question4();
        Scanner input = new Scanner(System.in);
        int equity = input.nextInt();
        esc.checkEquityStatus(equity);

        input.close();
    }
}
