package Tuesday1014;

public class Step7_GettersandSetters {
    static class Customer7{
        private String name;
        private int age;
        public Customer7(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
    }

    static void main(String[] args) {
        Customer7 c = new Customer7("Nia", 10);
        System.out.println("Before: " +c.getName()+ " - age " + c.getAge());
        c.setName("Nina");
        c.setAge(11);
        System.out.println("After : " +c.getName()+ " - age " +c.getAge());
    }
}
