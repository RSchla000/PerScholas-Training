package c04_PersonalComputer;

import c01_ComputerCase.Product;

public class ComputerCase extends Product {

    private String powerSupply;


    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}