package Logistics;

public class Task1 {
    static void main(String[] args) {
        OB07_PackagingBox box1 = new OB07_PackagingBox();

        box1.setLength(5);
        box1.setBreadth(3);
        box1.setHeight(2);

        System.out.println("Length:" +box1.getLength());
        System.out.println("Breadth:" +box1.getBreadth());
        System.out.println("Height:" + box1.getHeight());
    }
}
