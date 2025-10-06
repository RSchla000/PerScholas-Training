package Monday106;

public class AssetsLiabilitiesCheck {
    //1. Creating the Methods
    int CalculateEquity(int assets, int liabilities)
    {
        return assets - liabilities;
    }

    //Define method to display equation
    void displayAccountingEquation(){

        System.out.println("the value of assets is assets - liabilities = equity");
    }

    boolean compareEquation(int assets, int liabilities){

        return assets > liabilities;
    }




    static void main(String[] args) {
    //1.1 Call the Methods

    AssetsLiabilitiesCheck abc = new AssetsLiabilitiesCheck();
    System.out.println("Equity = " +abc.CalculateEquity(100,40));

    AssetsLiabilitiesCheck def = new AssetsLiabilitiesCheck();
    def.displayAccountingEquation();

    AssetsLiabilitiesCheck ghi= new AssetsLiabilitiesCheck();
    ghi.compareEquation(100,40);
    System.out.println("Compare" +ghi.compareEquation);
    }


    }

