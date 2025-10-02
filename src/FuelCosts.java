import java.util.Scanner;

public class FuelCosts {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;
        double costPer100Miles = 0.0;
        double fullTankDistance = 0.0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter the tank size in gallons: ");
            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine();
                if (tankSize <= 0) {
                    System.out.println("Tank size must be greater than zero.");
                    done = false;
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid tank size: " + trash);
                done = false;
            }
        } while (!done);

        do {
            System.out.print("Enter the miles per gallon: ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                if (milesPerGallon <= 0) {
                    System.out.println("Miles per gallon must be greater than zero.");
                    done = false;
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid miles per gallon: " + trash);
                done = false;
            }
        } while (!done);

        do {
            System.out.print("Enter the price per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                if (pricePerGallon < 0) {
                    System.out.println("Price per gallon cannot be negative.");
                    done = false;
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid price per gallon: " + trash);
                done = false;
            }
        } while (!done);

        costPer100Miles = (100 / milesPerGallon) * pricePerGallon;
        fullTankDistance = tankSize * milesPerGallon;
        System.out.printf("The cost per 100 miles is: $%.2f\n", costPer100Miles);
        System.out.printf("With a full tank, you can go: %.2f miles\n", fullTankDistance);


    }
}
