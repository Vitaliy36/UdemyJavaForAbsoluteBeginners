package oop;

public class Chair {
    //Instance variable / fields
    String colour = "red";
    int length;
    int width;
    int height;
    double weight;
    String modelNumber;
    String material;
    boolean hasArmRest;
    int minimumHeightLevel;
    int maximumHeightLevel;
    double currentHeightLevel;
    String position;

    //Methods
    void raise() {
        height++;
    }

    void lower() {
        height--;
    }

    void swivelLeft() {
        // rotate left
    }

    void swivelRight() {
        // rotate right
    }
}
