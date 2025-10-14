package Logistics;

public class OB07_PackagingBox {
    private double length;
    private double breadth;
    private double height;
    private double volume;

    public void setLength(double length){
        this.length = length;
    }
    public void setBreadth(double breadth){
        this.breadth = breadth;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }
    public void computeVolume(){
        volume = length*breadth*height;
    }
    public double getVolume(){
        return volume;
    }


}