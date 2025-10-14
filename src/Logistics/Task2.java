package Logistics;

public class Task2 {

    static void main(String[] args) {
        OB07_PackagingBox box2 = new OB07_PackagingBox();

        box2.setLength(4);
        box2.setBreadth(2);
        box2.setHeight(6);

        box2.computeVolume();
        System.out.println("Volume of the box: " + box2.getVolume());
    }
}
