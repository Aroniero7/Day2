package model;

public class Car {

    private String model;
    private int maxSpeed;
    private int yearOfCreate;

    public Car(String model, int maxSpeed, int yearOfCreate) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfCreate = yearOfCreate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }

    public void gas() {
        System.out.println("vrum vrum");
    }

}
