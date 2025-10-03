package Friday103;

public class Q5CycleThroughArrayIndices {
    static void main(String[] args) {
        int [] assets = {10,20,30,40,50,60,70,80,90,100};
        for (int i=0; i < 10; i++){
            System.out.println("Asset " + (i+1)+ "=" + assets[i]);
        }
    }
}
