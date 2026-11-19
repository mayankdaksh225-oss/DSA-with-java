public class Global_variable {
    static int x = 10;
    static void main() {
        func();
        System.out.println(x);
    }
    public static void func(){
        x = 344;
    }

}
