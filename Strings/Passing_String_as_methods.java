public class Passing_String_as_methods {
    public static void change(String x){
        x = "Buddu";
        System.out.println(x);
    }

    static void main() {
        String x = "Mayank";
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}
