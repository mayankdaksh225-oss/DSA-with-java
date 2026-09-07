import java.util.Arrays;

public class Shallow_Copy {
    public static void main(String[] args) {
        int [] x= {34,55,32,5,64,74,333};
        System.out.println(x[3]);
        int[] y = x;
        y[3] = 543;
        System.out.println(x[3]);

//        int x = 98;
//        System.out.println(x);
//        int y =x;
//        y = 88;
//        System.out.println(x);


    }
}
