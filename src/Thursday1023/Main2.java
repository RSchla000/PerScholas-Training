package Thursday1023;

class E{
    String[] names = {"Alice","Bob","Charlie"};

    String[] getNames(){
        return names;
    }
}
class F extends E {
    @Override
    String[] getNames(){
        return new String[]{"Ben","Bella","Blake"};
    }
}

class G extends E{
    @Override
    String[] getNames(){
        return new String[]{"Carl","Cathy"};
    }
}

public class Main2 {
    static void main(String[] args) {
        E objE = new E();
        F objF = new F();
        G objG = new G();
        System.out.println("From A: " +String.join(",", objE.getNames()));
        System.out.println("From B: "+String.join(",", objF.getNames()));
        System.out.println("From C: "+String.join(",",objG.getNames()));
    }
}
