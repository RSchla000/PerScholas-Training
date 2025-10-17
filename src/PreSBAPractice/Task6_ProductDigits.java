package PreSBAPractice;

public class Task6_ProductDigits {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num>0){
            int digit = num % 10;
            product *=digit;
            num/=10;
        }
        System.out.println("Product of digits: " + product);
    }
}
