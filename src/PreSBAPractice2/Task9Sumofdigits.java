package PreSBAPractice2;

public class Task9Sumofdigits {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int position = 1;
        while(num>0){
            int digit = num % 10;
            if(position % 2 != 0){
                sum += digit;
            }
            num/=10;
            position ++;
        }
        System.out.println("Sum of digits at odd positions: " + sum);
    }
}
