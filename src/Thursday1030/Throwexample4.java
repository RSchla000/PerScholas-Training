package Thursday1030;

public class Throwexample4 {
    static void main(String[] args) {
        String str = "abc";
        if (!str.matches("\\d+")){
            throw new NumberFormatException("Not a valid number: " + str);
        }
        int num = Integer.parseInt(str);
    }
}
