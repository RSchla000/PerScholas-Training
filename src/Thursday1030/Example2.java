package Thursday1030;

public class Example2 {
    static void main(String[] args) {
        String text = "abc";
        try {
            int n = Integer.parseInt(text);
            System.out.println("Number is" + n);
        } catch (NumberFormatException e){
            System.out.println("That is not a valid while number.");
        }
        System.out.println("Done");
    }
}
