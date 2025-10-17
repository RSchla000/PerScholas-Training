package PreSBAPractice;

public class Task1_SumDigits {
    static void main(String[] args) {
        //(1)import the scanner
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //(2) ask user for input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();             //(3) Read the number
        int sum = 0;            //(4)Initialize sum
        //(5) Loop to extract digit
        while(num > 0){
            int digit = num % 10;        //(6) Get last digit using modulus
            sum+=digit;                 //(7) Add digit to sum
            num/=10;                    //(8) Remove last digit

            System.out.println ("Sum of digits: " + sum); //(10) Output result
        }
    }
}