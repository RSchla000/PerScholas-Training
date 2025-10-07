package Tuesday107;

public class Practice {

    String color;
    int speed;

    void drive(){
        System.out.println("The car is moving at " +speed +"km/h");
    }

    static void main(String[] args) {
        Practice myCar = new Practice();//create object
        myCar.color = "Red";//Set Attribute
        myCar.speed = 100;
        myCar.drive();//call method

    }
}
