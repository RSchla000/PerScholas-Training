package PotentialSBA4;

public class StringBufferExample2 {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("135");

        sb.replace(1,3,"246");

        System.out.println("After replace: " + sb);
    }
}
