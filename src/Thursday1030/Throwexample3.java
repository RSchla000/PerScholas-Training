package Thursday1030;

public class Throwexample3 {
    static void main(String[] args) {
        int[] numbers = {1,2,3};
        if (numbers.length < 5) {
            throw new ArrayIndexOutOfBoundsException("Array index 5 does not exsist");
        }
        System.out.println(numbers[5]);
    }
}
