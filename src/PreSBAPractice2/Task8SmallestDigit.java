package PreSBAPractice2;

public class Task8SmallestDigit {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();;
        int min = 9;

        while(num>0){
            int digit = num %10;
            if(digit <  min){
                min = digit;
            }
            num /= 10;
        }
        System.out.println("Smallest digit: " +min);
    }
}
