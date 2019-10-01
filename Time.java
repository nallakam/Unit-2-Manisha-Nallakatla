import java.util.Scanner;

public class Time
{
    public static void main(String[] args) {
        final int SECONDSINHOURS = 3600;
        final int SECONDSINMINUTES = 60;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of hours:");
        double hours = scan.nextDouble();

        System.out.println("Enter the number of minutes:");
        double min = scan.nextDouble();

        System.out.println("Enter the number of seconds:");
        double sec = scan.nextDouble();

        System.out.println("The total number of seconds is:");
        System.out.println(((hours)*SECONDSINHOURS)+((min)*SECONDSINMINUTES)+(sec));
    }
}
