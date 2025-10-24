package PotentialSBA4;

public class StringBufferExample3 {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("ABCDE");
        sb.replace(2,3,"X");
        System.out.println("After replace: " + sb);
    }
}
