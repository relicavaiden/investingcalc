import java.util.Scanner;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your buying price per share: $");
        double optionPrice = scan.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while(true) {
            System.out.print("Enter the closing price for the day: "
                    + day + " (any negative value will exit): ");
            closingPrice = scan.nextDouble();

            if (closingPrice < 0.0) break;
            double earnings = closingPrice - optionPrice;

            if (earnings > 0) {
                System.out.println("After day " + day + ", you earned $"
                + df.format(earnings) + " per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day " + day + ", you lost $"
                        + df.format(-earnings) + " per share.");
            } else {
                System.out.println("After day " + day + ", you have " +
                "no earnings per share.");
            }

            day++;
        }
        scan.close();
    }
}