import java.util.*;
import java.util.Scanner;
public class Needle {

    private Random generator;
    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops) {
        int hits = 0;
        for (int i = 0; i < totalDrops; i++) {
            double y_low = generator.nextDouble() * 2.0; //generates a double from 0 to 1.0 *2
            double alpha = generator.nextDouble() * 180.0; //random degree from 0 to 180
            double alphaRadian = Math.toRadians(alpha); // convert degree to radian
            double y_high = y_low + Math.sin(alphaRadian); //the top point of the needle
            if (y_high >= 2.0) {
                hits++; //if it is over 2.0 inches, it hits so plus one on total hit number
            }
        }
        if (hits == 0) {
            System.out.println("Experiment failed.");
        } //just in case that the super rare possibility that this happens
        return (double) totalDrops / hits; //calculates pi
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Drops in total: ");
        int D = sc.nextInt(); //input number of drops
        double pi = new Needle().runExperiment(D);
        System.out.println("Pi is: " + pi);
    }
}
