package PotentialSBA4;

public class StringBufferExample5 {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("135");

        sb.replace(0,1,"9");
        sb.insert(2,"24");
        sb.reverse();

        System.out.println("After replace, insert, and reverse: " + sb);
    }
}
