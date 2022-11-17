package oop;

public class DoorMain {
    public static void main(String[] args) {
        Door dd = new Door();
        dd.name = "Driver";
        dd.open();
        dd.printStatus();

        Door pd = new Door();
        pd.name = "Passenger";
        pd.open();
        pd.printStatus(); // passenger door is close by default
        dd.close();
        dd.printStatus();


    }
}
