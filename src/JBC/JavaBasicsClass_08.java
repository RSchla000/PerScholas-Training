package JBC;

public class JavaBasicsClass_08 {
    static void main(String[] args) {
        double Coffee = 4.99;
        double Green_Tea = 2.99;
        double Cookie = 1.99;



        double subtotal = Coffee*3+Green_Tea*4+Cookie*2;
        final double SALES_TAX = subtotal*.035;
        double totalSale = subtotal+SALES_TAX;

        System.out.println("Coffee: $4.99");
        System.out.println("Green Tea: $2.99");
        System.out.println("Cookie: $1.99");

        System.out.println("------------------------");
        System.out.println("Subtotal:$" + subtotal);
        System.out.println("Total:");
        System.out.printf("%.2f",totalSale);
    }
}
