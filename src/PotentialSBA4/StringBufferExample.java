package PotentialSBA4;

public class StringBufferExample {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("135");

        sb.replace(0,1,"9");
        sb.insert(2,24);
        System.out.println("After replace and insert: " + sb);
    }
}
