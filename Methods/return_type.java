public class return_type {
//    public static void main(String[] args) {
//        int x = prasun(7);
//        System.out.println(x+3);
//    }
//    public static int prasun(int a){
//        System.out.println("banu");
//        if(a>0) return 5;
//        else return 7;
//    }
    public static int greatest(int a, int b, int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }
public static void main(String[] args) {
    System.out.println(greatest(9,5,6));
}


}
