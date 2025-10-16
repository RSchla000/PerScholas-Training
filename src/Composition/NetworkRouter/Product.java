package Composition.NetworkRouter;

public class Product {
    private String model;
    private String manufacturer;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
    public String getModel(){return model;}
    public String getManufacturer(){return manufacturer;}

}
