package PreSBAPractice2;

public class Task10SumDigitsdivisableby3 {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit % 3 == 0){
                sum += digit;
            }
            num /=10;
        }
        System.out.println("Sum of digitss divisable by 3: "+ sum);
    }
}
