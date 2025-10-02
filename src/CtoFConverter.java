import java.util.Scanner;

public class CtoFConverter
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;//(celsius * 9/5) + 32;
        boolean done = false;
        String trash = "";

        do {


            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");

            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid temperature: " + trash);
                done = false;
            }
        } while (!done);

    }

}