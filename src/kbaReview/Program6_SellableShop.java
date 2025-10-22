package kbaReview;

import java.util.ArrayList;
import java.util.List;

public class Program6_SellableShop {
    interface Sellable{
        String getName();
        double getPrice();
    }
    static class Book implements Sellable{
        String title;
        double price;

        Book(String title, double price){
            this.title = title;
            this.price = price;
        }
        @Override
        public String getName(){
            return title;
        }
        @Override
        public double getPrice(){
            return price;
        }
    }
    static class Game implements Sellable{
        String name;
        double price;

        Game(String name, double price){
            this.name = name;
            this.price = price;
        }
        @Override
        public String getName(){
            return name;
        }
        @Override
        public double getPrice(){
            return price;
        }
    }

    static void main(String[] args) {
        List<Sellable> shop = new ArrayList<>();
        shop.add(new Book("Magic Trees",12.99));
        shop.add(new Game("Space Adventure", 29.99));
        shop.add(new Book("Ocean Tales",8.50));

        double total = 0;
        System.out.println("Shop items:");
        for (Sellable s : shop){
            System.out.printf("=%s : $%.2f%n", s.getName(),s.getPrice());
            total += s.getPrice();
        }
        System.out.printf("Total price: $%.2f%n", + total);
    }
}
