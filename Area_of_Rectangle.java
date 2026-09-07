import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        float l = input.nextFloat();
        System.out.print("Enter Bridth: ");
        float b = input.nextFloat();

        float area = l*b;
        System.out.print("Area of the Rectangle is: "+area);
    }
}
