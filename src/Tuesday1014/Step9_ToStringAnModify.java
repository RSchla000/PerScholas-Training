package Tuesday1014;

public class Step9_ToStringAnModify {
    static class Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){return name;}
        public void setName(String name){this.name = name;}
        public int getAge(){return age;}
        public void setAge(int age){this.age = age;}
        @Override
        public String toString(){
            return "Person{name = " +name+ ", age =" +age+ "}";
        }
    }

    static void main(String[] args) {
        Person p = new Person("Alex",15);
        System.out.println("Before: " +p);
        p.setAge(16);
        p.setName("Alexa");
        System.out.println("After: " +p);
    }
}