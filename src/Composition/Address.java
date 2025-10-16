package Composition;

public class Address {
    String street;
    String city;
    String zipcode;

    public Address(String street, String city, String zipcode)
    {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }
    public void displayAddress(){
        System.out.println(street +","+city+"-"+zipcode);
    }
}
