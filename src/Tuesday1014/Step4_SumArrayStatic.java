package Tuesday1014;

public class Step4_SumArrayStatic {
    static void main(String[] args) {
        int [] numbers = {1,2,3,4};
        int total = sumArray(numbers);
        System.out.println("Total sum = " + total);
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for (int n : arr){
            sum +=n;
        }
        return sum;
    }
}
