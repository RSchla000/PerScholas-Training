package Guided_LAB303JavaStringMethod;

public class replaceAll {
    static void main(String[] args) {
        String str1 = "Java123is456fun";

        String regex = "\\d+";

        System.out.println(str1.replaceAll(regex, " "));

    }
}
