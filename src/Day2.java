import model.Car;
import model.F1Car;
import model.StaticClass;
import model.Truck;

public class Day2 {
    public static void main(String[] args) {

        Car car = new Car("BMW", 150, 2006);
        F1Car f1Car = new F1Car("Ferari", 450, 2022);
        Truck truck = new Truck("MAN", 100, 2015, "FFF");
        car.gas();
        f1Car.gas();
        truck.gas();
        Truck.truck();
        System.out.println(StaticClass.print());
    }
}
