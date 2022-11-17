package tutor.urkaineHW;

import java.util.ArrayList;
import java.util.List;

public class Formula1 {
    public static void main(String[] args) {
        Car bmw = new Car("Yellow", 27894625, 5.5, "X5");
        Car porsche = new Car("Red", 67893453, 5.5, "Cayenne");
        Car tesla = new Car("White", 18342678, 5.5, "Cyber Truck");
        List<Car> carList = new ArrayList<Car>();
        carList.add(bmw);
        carList.add(porsche);
        carList.add(tesla);

        for (Car car : carList) {
            int distance = car.getDistance(70, 200);
            car.distance = distance;
        }
        Car winner = carList.get(0);
        for (int i = 1; i < carList.size(); i++) {
            if (carList.get(i).distance > winner.distance) {
                winner = carList.get(i);
            }
        }
        System.out.println("Winner. Brand: " + winner.brand);
    }
}
