package Logistics;

public class Task7 {
    static void main(String[] args) {
        OB07_PackagingBox box1 = new OB07_PackagingBox();
        OB07_PackagingBox box2 = new OB07_PackagingBox();
        OB07_PackagingBox box3 = new OB07_PackagingBox();

        box1.setWeight(5);
        box2.setWeight(8);
        box3.setWeight(6);

        double heaviest = box1.getWeight();
        if (box2.getWeight()> heaviest) heaviest = box2.getWeight();
        if (box3.getWeight()> heaviest) heaviest = box3.getWeight();

        System.out.println("Heaviest box weight: " + heaviest);
    }
}
