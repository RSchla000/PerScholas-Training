package Guided_LAB303JavaStringMethod;

public class indexOf {
    static void main(String[] args) {
        String str1 = "Java is fun";
        int result;

        result = str1.indexOf('s');

        System.out.println(result); // 6

        result = str1.lastIndexOf('J');
        System.out.println(result);
        result = str1.lastIndexOf('a');
        System.out.println(result); // 3

        result = str1.lastIndexOf('j');
        System.out.println(result); // -1

        result = str1.lastIndexOf("ava");
        System.out.println(result); // 1

        result = str1.lastIndexOf("java");
        System.out.println(result);
    }
}
