package GuidedLab30351ForLoop;

public class Ex02DisplaySumofNAturalNumbers {
    static void main(String[] args) {
        int sum = 0;
        int n = 1000;
        for (int i = 1; i <= n; ++i) {

            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
