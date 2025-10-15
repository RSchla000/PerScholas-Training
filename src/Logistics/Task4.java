package Logistics;

public class Task4 {
    static void main(String[] args) {
        OB07_PackagingBox box1 = new OB07_PackagingBox();
        OB07_PackagingBox box2 = new OB07_PackagingBox();

        box1.setLength(4);box1.setBreadth(3);box1.setHeight(2);
        box2.setLength(5);box2.setBreadth(2);box2.setHeight(2);

        box1.computeVolume();
        box2.computeVolume();

        if (box1.getVolume()> box2.getVolume()){
            System.out.println("Box 1 is bigger with volume " + box1.getVolume());
        }else{
            System.out.println("Box 2 is bigger with volume " + box2.getVolume());
        }
    }
}
