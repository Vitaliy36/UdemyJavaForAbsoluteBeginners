package tutor.urkaineHW;

public class Car {

    public int distance;

    public String colour;
    public int vinNumber;
    public double engine;
    public String brand;

    public Car(String colour, int vinNumber, double engine, String brand) {
        this.colour = colour;
        this.vinNumber = vinNumber;
        this.engine = engine;
        this.brand = brand;
    }

    public int getDistance(int from, int to) {
        return (int) Math.round(Math.random() * to + from);
    }

}
