import java.util.Scanner;

public class Volume_of_the_sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float r = input.nextFloat();
        float vol =  (4f/3f)*3.14159265359f*r*r*r;
        System.out.println("Volume is: "+vol+" cm cube");
    }
}
