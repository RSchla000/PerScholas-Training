package Logistics;

public class Task5 {
    static void main(String[] args) {
        OB07_PackagingBox[] boxes = new OB07_PackagingBox[3];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new OB07_PackagingBox();
        }

        boxes[0].setLength(2);
        boxes[0].setBreadth(3);
        boxes[0].setHeight(4);
        boxes[0].setWeight(5);
        boxes[0].setPrice(10);

        boxes[1].setLength(3);
        boxes[1].setBreadth(3);
        boxes[1].setHeight(3);
        boxes[1].setWeight(6);
        boxes[1].setPrice(12);

        boxes[2].setLength(1);
        boxes[2].setBreadth(2);
        boxes[2].setHeight(5);
        boxes[2].setWeight(4);
        boxes[2].setPrice(8);

        for(OB07_PackagingBox b : boxes){
            b.computeVolume();
        }
            System.out.println("Length\tBreadth\tHeight\tWeight\tPrice\tVolume");
        for (OB07_PackagingBox b : boxes){
            System.out.println(b.getLength() + "\t"
                             + b.getBreadth() + "\t"
                             + b.getHeight() + "\t"
                             + b.getWeight() + "\t"
                             + b.getPrice() + "\t"
                             + b.getVolume()
            );
        }
    }
}