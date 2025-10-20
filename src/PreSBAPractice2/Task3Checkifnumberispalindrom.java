package PreSBAPractice2;

public class Task3Checkifnumberispalindrom {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while(num > 0){
            int digit = num %10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if (reverse == original){
            System.out.println(original + " is a palindrome");
        }else{
            System.out.println(original + " is not a palindrom");
        }
    }
}
