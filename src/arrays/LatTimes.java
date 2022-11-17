package arrays;

import java.util.Scanner;

public class LatTimes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of laps: ");
        int numberOfLaps = scanner.nextInt();

        double[] lapTimes = new double[numberOfLaps];

        for (int i = 0; i < numberOfLaps; i++) {
            System.out.print("Lap time: ");
            lapTimes[i] = scanner.nextDouble();
        }

        double fastestTime = lapTimes[0];
        for (int i = 1; i < lapTimes.length; i++) {
            if (lapTimes[i] < fastestTime) {
                fastestTime = lapTimes[i];
            }
        }

        System.out.println("Fastest time: " + fastestTime);
    }
}
