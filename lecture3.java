import java.util.Scanner;
public class lecture3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dgree: ");
        double fharenheit = input.nextDouble();
        
        double celsius = (5.0/9)*(fharenheit - 32);
        System.out.println("Fahrenhiet " + fharenheit+ " is " + celsius + " in Celsius");

    }
}
