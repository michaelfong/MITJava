package lab1;

/**
 * Created by mfong on 10/18/14.
 */
import java.util.Scanner;

public class GravityCalculatorApp {

    public static void main(String[] arguments) {

        // Scanner Input Object
        Scanner scanner_input = new Scanner(System.in);
        double positionInitial;         // initial position along x-axis
        double positionFinal;          // final position along x-axis
        double velocityInit;           // initial velocity
        double timeDuration;           // time (sec) interval of acceleration

        // Prompts the User
        System.out.println("Welcome to the Gravity Calculator. ");
        System.out.println("Enter position of object (meters),");
        System.out.println("und initial velocity of object (meters/sec),");
        System.out.println("und time allowed for object to accelerate (sec).");
        System.out.println("Separate each input with <space> or <return-key>.");

        // Read in values
        positionInitial = scanner_input.nextDouble();
        velocityInit   = scanner_input.nextDouble();
        timeDuration   = scanner_input.nextDouble();

        // Call GravityCalculator
         GravityCalculator xyz = new GravityCalculator();

        positionFinal = xyz.computeAccelGravity(positionInitial, velocityInit, timeDuration);

        System.out.println("Inputs: " + " " + positionInitial + " " + "initial position");
        System.out.println("           " + velocityInit + " " + "initial velocity");
        System.out.println("           " + timeDuration + " " + "time interval of acceleration");
        System.out.println("Here is the output Created: ");
        System.out.println("X(final) = " + positionFinal);

    }
}
