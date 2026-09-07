import java.util.Arrays;

public class Deep_copy {
    public static void main(String[] args) {
        int [] x = {45,3,5,63,32,22,12,178};
        System.out.println(x[2]);
        int [] arr = Arrays.copyOf(x,x.length);
        arr[2] = 4567;
        System.out.println(arr[2]);

    }
}
