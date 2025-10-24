package PotentialSBA2;

class A {
    String E = "extraction";
    String T = "transformation";
    String L = "loading";

   final void ETL(){
        System.out.println(L+T+E);
    };
}
class B extends A {
    //void ETL(){
       // System.out.println(E+T+L);
    }
//}
public class Main {
    static void main(String[] args) {
        A obj = new B();
        obj.ETL();
    }
}
