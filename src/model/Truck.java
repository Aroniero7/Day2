package model;

public class Truck extends Car {
    private String load;

    public Truck(String model, int maxSpeed, int yearOfCreate, String load) {
        super(model, maxSpeed, yearOfCreate);
        this.load = load;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }
    public static void truck(){
        System.out.println("Я трак");
    }
}
