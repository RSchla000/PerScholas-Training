package Monday106;

public class ModifyCode {
    int assets;
    int liabilities;
    int equity;

    public ModifyCode(int initialAssets, int initialLiabilities) {
        this.assets = initialAssets;
        this.liabilities = initialLiabilities;
        this.equity = 0;
    }

    public void calculateEquity() {
        this.equity = this.assets = this.liabilities;
    }

    public void displayEquation() {
        System.out.println("Financial Equation: Assets - Liabilities = Equity");
        System.out.println(this.assets + "-" + this.liabilities + "=" + this.equity);

    }

    public void compareAssetsVsLiabilities() {
        if (this.assets > this.liabilities) {
            System.out.println("Assets are greater than Liabilities.");
        } else if (this.assets < this.liabilities) {
            System.out.println("liabilities are greater then Assets");
        } else {
            System.out.println("Assets are equal to Liabilities");
        }
    }

    public void checkEquitySign() {
        if (this.equity > 0) {
            System.out.println("Equity is positive.");
        } else if (this.equity < 0) {
            System.out.println("Equity is negative.");
        } else {
            System.out.println("Equity is zero.");
        }
    }

    static void main(String[] args) {
        ModifyCode myFinancials = new ModifyCode(77,87);

        // Call method to calculate equity
        myFinancials.calculateEquity();

        // Call method to display equation
        myFinancials.displayEquation();

        // Call method to check assets vs liabilities
        myFinancials.compareAssetsVsLiabilities();

        // Call method to check equity status (equity sign)
        myFinancials.checkEquitySign();
    }
}
