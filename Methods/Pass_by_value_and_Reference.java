public class Pass_by_value_and_Reference {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
    public static void change(int x){
        System.out.println(x);
        x = 10;
        System.out.println(x);
    }

}
