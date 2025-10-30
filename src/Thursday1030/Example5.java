package Thursday1030;

public class Example5 {

    public static void eatCookies(int n) throws TooManyCookiesException {
        if (n > 5) {
            throw new TooManyCookiesException("That's too many cookies: " + n);
        }
        System.out.println("Enjoy your " + n + " cookies!");
    }

    public static void main(String[] args) {
        try {
            eatCookies(7);
        } catch (TooManyCookiesException e) {
            System.out.println("Stop! " + e.getMessage());
        }
    }
}