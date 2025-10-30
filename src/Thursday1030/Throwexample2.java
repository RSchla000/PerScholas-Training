package Thursday1030;

public class Throwexample2 {
    static void main(String[] args) {
        String text = null;
        if(text == null){
            throw new NullPointerException("Text cannot be null");
        }
        System.out.println(text.length());
    }
}
