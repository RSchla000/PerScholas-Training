package kbaReview;

public class Program5_ManyInterfaces {
    interface Playable{
        void play();
    }
    interface Chargeable{
        void charge();
    }
    static class ToyRobot implements Playable, Chargeable{
        String model;
        ToyRobot(String model){
            this.model = model;
        }
        @Override
        public void play(){
            System.out.println(model + " plays music and dances.");
        }
        @Override
        public void charge(){
            System.out.println(model + " is charging its battery.");
        }
    }

    static void main(String[] args) {
        ToyRobot t = new ToyRobot("RoboFun");
        t.play();
        t.charge();
    }
}
