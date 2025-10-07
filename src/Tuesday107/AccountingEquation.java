package Tuesday107;

public class AccountingEquation {
    void displayAccountingEquation(int assets, int liabilities, int equity) {
        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);
    }

    public static void main(String[] args) {
        AccountingEquation ae = new AccountingEquation();

        int assets = 100;
        int liabilities = 40;
        int equity = 60;

        ae.displayAccountingEquation(assets, liabilities, equity);
    }
}


