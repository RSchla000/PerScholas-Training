package kbaReview;

public class Program3_PolymorphParade {
    interface Worker{
        void work();
    }
    static class Teacher implements Worker{
        @Override
        public void work(){
            System.out.println("Teacher: Teaching math.");
        }
    }
    static class Farmer implements Worker{
        @Override
        public void work(){
            System.out.println("Farmer: Harvesting crops.");
        }
    }
    static class Chef implements Worker{
        @Override
        public void work(){
            System.out.println("Chef: cooking yummy food.");
        }
    }

    static void main(String[] args) {
        Worker[] parade = {new Teacher(),new Farmer(),new Chef()};
        for (int i = 0; i < parade.length; i++) {
            parade[i].work();

        }
    }
}
