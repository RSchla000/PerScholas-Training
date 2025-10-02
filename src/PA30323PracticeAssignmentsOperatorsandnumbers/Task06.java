package PA30323PracticeAssignmentsOperatorsandnumbers;

public class Task06 {
    static void main(String[] args) {
        // Method 1: Using the addition assignment operator (+=)
        int number1 = 5;
        System.out.println("Initial value (Method 1): " + number1);
        number1 += 1; // Increment by 1
        System.out.println("After first increment (Method 1): " + number1);
        number1 += 1; // Increment by 1 again
        System.out.println("After second increment (Method 1): " + number1);
        System.out.println();

        // Method 2: Using the pre-increment operator (++)
        int number2 = 10;
        System.out.println("Initial value (Method 2): " + number2);
        ++number2; // Increment by 1
        System.out.println("After first increment (Method 2): " + number2);
        ++number2; // Increment by 1 again
        System.out.println("After second increment (Method 2): " + number2);
        System.out.println();

        // Method 3: Using the post-increment operator (++)
        int number3 = 15;
        System.out.println("Initial value (Method 3): " + number3);
        number3++; // Increment by 1
        System.out.println("After first increment (Method 3): " + number3);
        number3++; // Increment by 1 again
        System.out.println("After second increment (Method 3): " + number3);
    }
}

