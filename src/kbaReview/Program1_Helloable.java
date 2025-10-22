package kbaReview;

public class Program1_Helloable {
    interface Helloable {
        void sayHello();
    }
    static class Kid implements Helloable{
        String name;
        Kid(String name){
            this.name = name;
        }
        @Override
        public void sayHello(){
            System.out.println("Hi! "+name+" - nice to meet you!");
        }
    }

    static void main(String[] args) {
        Kid k = new Kid("Sam");
        k.sayHello();
    }
}
