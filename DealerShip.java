import java.util.Arrays;

public class DealerShip {

    private Car[] cars;

    public DealerShip(Car[] cars) {

        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }

    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }

    public void sell(int i){
        this.cars[i].drive();
    }

}
