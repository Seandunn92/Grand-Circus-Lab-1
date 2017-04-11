/**
 * Created by seandunn92 on 4/11/17.
 */
import java.util.Scanner;

public class Main {
    public static double width = -1.0;
    public static double height = -1.0;

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Area and Perimeter Calculator");
        System.out.println();
        System.out.println("Enter in the width of the rectangle in double form, assuming feet as unit," +
                "(6ft 6 inches would be 6.5)");
        width = scnr.nextDouble();



        System.out.println("Enter in the height of the rectangle");
        height = scnr.nextDouble();

        System.out.println("The area of the rectangle is " + width*height + " feet.");

        System.out.println("The perimeter of the rectangle is " + 2*(width + height) +" feet.");

        scnr.close();

        // write your code here
    }

}
