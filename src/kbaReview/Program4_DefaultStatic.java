package kbaReview;

public class Program4_DefaultStatic {
    interface Mover{
        void move();
        default void walk(){
            System.out.println("Walking slowly...");
        }
        static void describe(){
            System.out.println("Mover: types that can move in some way.");
        }
    }
    static class Bird implements Mover{
        @Override
        public void move(){
            System.out.println("Bird: I flap wings and fly!");
        }
    }
    public static void main(String[] args){
        Bird b = new Bird();
        b.move();
        b.walk();
        Mover.describe();
    }
}
