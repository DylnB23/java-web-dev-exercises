package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven today? ");
        Double milesDriven = input.nextDouble();

        System.out.println("How much gas have you used in gallons? ");
        Double gasUsed = input.nextDouble();

        Double milesPerGallon = milesDriven / gasUsed;
        System.out.println("You're fuel efficiency was " + milesPerGallon + " mpg.");

    }
}
