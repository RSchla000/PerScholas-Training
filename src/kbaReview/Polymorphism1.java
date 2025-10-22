package kbaReview;

    class Animal{
        public void makeSound(){
            System.out.println("Some animal sound");
        }
    }
    class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println("Woof!");
        }
    }
    class Cat extends Animal{
        @Override
        public void makeSound(){
            System.out.println("Meow!");
        }
    }
    public class Polymorphism1{
        static void main(String[] args) {
            Animal a1 = new Dog();
            Animal a2 = new Cat();
            a1.makeSound();
            a2.makeSound();
        }
    }