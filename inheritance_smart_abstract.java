import java.util.*;
abstract class Vehicles 
{
    String brand; 
    float price;

    Vehicles(String brand, float price)
    {
        this.brand = brand;
        this.price = price;
    }
    
    abstract void displayInformation();
}

class Car extends Vehicles
{ 
    Car(String brand, float price) {
        super(brand, price); 
    }

    @Override
    void displayInformation() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

class Bike extends Vehicles
{
    Bike(String brand, float price) {
        super(brand, price); 
    }

    @Override
    void displayInformation() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

class Truck extends Vehicles
{
    Truck(String brand, float price) {
        super(brand, price); 
    }

    @Override
    void displayInformation() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

public class Accesser
{
    public static void main(String args[])
    {
        Vehicles v1 = new Car("Bajaj", 1000000f);
         Vehicles v2 = new Bike("KTM", 500000f);
          Vehicles v3 = new Truck("Toyota", 250000000f);

        v1.displayInformation();
          v2.displayInformation();
    v3.displayInformation();
    }
}
