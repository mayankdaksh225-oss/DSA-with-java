import java.util.Scanner;

public class passing_classes_to_method {
    public static class Car{
        String name;
        String type;
        int engine;
        int seats;
        int price;
        void print(){
            System.out.println(name+" "+type+" "+engine+" "+seats+" "+price);
        }
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        Car c1 = new Car();
        System.out.print("Name: ");
        c1.name = input.nextLine();
        System.out.print("type: ");
        c1.type = input.nextLine();
        System.out.print("engine: ");
        c1.engine=input.nextInt();
        System.out.print("seats: ");
        c1.seats = input.nextInt();
        System.out.print("Price: ");
        c1.price = input.nextInt();

        if(c1.price<1000000){
            change(c1);
        }
        c1.print();
    }
    public static void change( Car c1){
        c1.seats = 4;
    }
}
