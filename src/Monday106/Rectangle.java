package Monday106;

public class Rectangle {

    double area (double length, double width){
        return length*width;
    }
    double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Area:  " +r.area(5,3));
        System.out.println("Perimeter:  "+r.perimeter(5,3));

    }
}
