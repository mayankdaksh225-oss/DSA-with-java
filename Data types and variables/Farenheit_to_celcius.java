import java.util.Scanner;

public class Farenheit_to_celcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in Farenheit: ");
        int f = (int) input.nextFloat();

        float celcius = (float) (f-32)*5/9;
        System.out.print("Temp in Celcius: "+ celcius +" Degree");

    }
}
