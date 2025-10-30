package Thursday1030;

public class Example3 {
    public static void main(String[] args) {
        String text = null;
        try {
            // Might throw NullPointerException
            int len = text.length();
            // Might throw NumberFormatException (if the previous line didn't fail)
            int n = Integer.parseInt("12a");
            System.out.println("len: " + len + ", n: " + n);
        } catch (NullPointerException e) {
            System.out.println("Oops — we tried to use something that wasn't there!");
        } catch (NumberFormatException e) {
            System.out.println("Oops — bad number text.");
        } finally {
            System.out.println("This always runs (cleanup).");
        }
    }
}

