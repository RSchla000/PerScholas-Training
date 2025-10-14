package Tuesday1014;

public class Step6_GettersOnly {
    static class Customer6{
        private String name;
        private int age;
        public  Customer6(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        static void main(String[] args) {
            Customer6 c = new Customer6("Leo", 12);
            System.out.println("Customer: " +c.getName()+ " - age "+ c.getAge());
        }
        }
    }