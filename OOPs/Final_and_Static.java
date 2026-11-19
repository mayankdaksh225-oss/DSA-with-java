class Cricketer{
    static String country = "Nz";
    int runs;
    double avg;

}
public class Final_and_Static {
    static void main() {
        Cricketer c1 = new Cricketer();
        c1.country = "India";
        Cricketer c2 = new Cricketer();
        System.out.println(c2.country);
    }
}
