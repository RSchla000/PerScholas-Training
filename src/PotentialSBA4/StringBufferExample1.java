package PotentialSBA4;

public class StringBufferExample1 {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("135");

        sb.replace(0,1,"9");
        System.out.println("After replace: "+ sb);
    }
}
