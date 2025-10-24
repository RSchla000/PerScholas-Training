package PotentialSBA4;

import java.util.StringJoiner;

public class StringBufferExample8 {

    static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(":","{","}");
        StringJoiner sj2 = new StringJoiner(",","[","]");
        sj1.add("Name").add("Tony");
        sj2.add("LastName").add("Stark");
        System.out.println(sj1.merge(sj2).toString());
    }
}
