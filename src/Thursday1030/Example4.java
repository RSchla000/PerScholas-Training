package Thursday1030;

public class Example4 {

    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        System.out.println("Age is OK: " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught problem: " + e.getMessage());
        }
    }
}