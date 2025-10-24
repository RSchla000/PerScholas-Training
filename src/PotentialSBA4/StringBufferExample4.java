package PotentialSBA4;

public class StringBufferExample4 {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("123456");
        sb.replace(3,6,"789");
        System.out.println("After replace: " + sb);
    }
}
