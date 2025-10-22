package kbaReview;

public class Program2_ManyGreeters {
    interface Greeter{
        void greet();
    }
    static class Robot implements Greeter{
        @Override
        public void greet(){
            System.out.println("Robot: Beep beep! I greet you politely");
        }
    }
    static class Dog implements Greeter{
        @Override
        public void greet(){
            System.out.println("Dog: Woof! Happy to see you!");
        }
    }
    static class Cat implements Greeter{
        @Override
        public void greet(){
            System.out.println("Cat: Meow! Now feed me!");
        }
    }

    static void main(String[] args) {
        Greeter r = new Robot ();
        Greeter d = new Dog();
        Greeter c = new Cat();
        r.greet();
        d.greet();
        c.greet();
    }
}
