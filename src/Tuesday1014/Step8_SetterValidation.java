package Tuesday1014;

public class Step8_SetterValidation {
    static class Customer8{
        private String name;
        private int age;
        public Customer8(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){ return name;}
        public int getAge(){ return age;}
        public void setAge(int age){
            if (age<0){
                System.out.println("Invalid age: " +age+ ". Age not changed.");
                return;
            }
            this.age = age;
        }
    }

    static void main(String[] args) {
        Customer8 c = new Customer8("Sam", 20);
        System.out.println("Initial age = " +c.getAge());
        c.setAge(-5);
        System.out.println("After invalid set attempt: age = " + c.getAge());
    }
}
