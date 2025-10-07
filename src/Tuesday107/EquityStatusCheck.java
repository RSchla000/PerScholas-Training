package Tuesday107;

public class EquityStatusCheck {

    void checkEquityStatus(int equity){
        String equityStatus = (equity > 0)?"Equity is positive":"Equity is negative";
        System.out.println(equityStatus);
    }

    static void main(String[] args) {
        EquityStatusCheck esc = new EquityStatusCheck();
        int equity = 60;
        esc.checkEquityStatus(equity);
    }
}
