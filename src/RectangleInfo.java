import java.util.Scanner;

public class RectangleInfo {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        int area = 0;
        int perimeter = 0;
        int diagonal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter the length: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                if (length <= 0) {
                    System.out.println("Length must be greater than zero.");
                    done = false;
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid length: " + trash);
                done = false;
            }
        } while (!done);

        do {
            System.out.print("Enter the width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width <= 0) {
                    System.out.println("Width must be greater than zero.");
                    done = false;
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid width: " + trash);
                done = false;
            }
        } while (!done);

        area = (int) (length * width);
        perimeter = (int) (2 * (length + width));
        diagonal = (int) (Math.sqrt((length * length) + (width * width)));

        System.out.println("The area is " + area + " and the perimeter is " + perimeter + ".");
        System.out.println("The diagonal is " + diagonal + ".");


    }
}
