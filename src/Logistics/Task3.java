package Logistics;

public class Task3 {
    static void main(String[] args) {
        OB07_PackagingBox box3 = new OB07_PackagingBox();

        box3.setLength(3);
        box3.setBreadth(2);
        box3.setHeight(5);

        box3.setWeight(10.5);
        box3.setPrice(20.0);

        box3.computeVolume();

        System.out.println("Length: " + box3.getLength());
        System.out.println("Breadth: " + box3.getBreadth());
        System.out.println("Height: " + box3.getHeight());
        System.out.println("Weight: " + box3.getWeight());
        System.out.println("Price: " + box3.getPrice());
        System.out.println("Volume: " + box3.getVolume());

    }
}
