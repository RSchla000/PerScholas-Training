package Thursday1023;

class A{
    String[] names = {"Alice","Bob","Charles"};
    String[] getNames(){
        return names;
    }
}
class B extends A{}
class C extends A{}
class D extends A{}

public class Main {
    static void main(String[] args) {
        B objB = new B();
        C objC = new C();
        D objD = new D();

        System.out.println("From B class:");
        for(String name : objB.getNames()){
            System.out.println(name);
        }
        System.out.println(("From C class:"));
        for (String name : objC.getNames()) {
            System.out.println(name);
        }

            System.out.println("From D class:");
            for(String name : objD.getNames()){
                System.out.println(name);
        }
    }
}
