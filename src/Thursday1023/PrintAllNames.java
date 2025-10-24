package Thursday1023;


class X {
    String[] names = {"Alice", "Bob"};

    String[] getNames() {
        return names;
    }
}

class Y extends X {
    String[] moreNames = {"Ben", "Bella"};

    void printAllNames() {
        System.out.println("Names from A: ");
        for (String name : getNames()) {
            System.out.println(name); // Corrected from 'names' to 'name'
        }

        System.out.println("Names from B: ");
        for (String name : moreNames) {
            System.out.println(name); // Corrected from 'names' to 'name'
        }
    }
}

public class PrintAllNames {
    public static void main(String[] args) {
        Y objY = new Y(); // Changed from X to Y
        objY.printAllNames(); // Correct method call
    }
}