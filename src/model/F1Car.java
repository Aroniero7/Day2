package model;

public class F1Car extends Car {

    public F1Car(String model, int maxSpeed, int yearOfCreate) {
        super(model, maxSpeed, yearOfCreate);
    }

    @Override
    public void gas() {
        super.gas();
        System.out.println("Еду на формуле");
    }
}
