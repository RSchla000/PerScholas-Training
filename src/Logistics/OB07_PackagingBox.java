package Logistics;

public class OB07_PackagingBox {
    private double length;
    private double breadth;
    private double height;
    private double volume;
    private double weight;
    private double price;

    public void setLength(double length){
        this.length = length;
    }
    public void setBreadth(double breadth){
        this.breadth = breadth;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setPrice(double price){
        this.price = price;
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

   public double getWeight(){
        return weight;
   }
   public double getPrice(){
        return price;
   }
}