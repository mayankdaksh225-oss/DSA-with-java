import java.util.Arrays;

public class Sorting_in_Arrays_by_Built_in_function {
    public static void main(String[] args) {
        int [] x = {12,45,32,56,778,85};
        System.out.println("Without sorting");
        print(x);
        System.out.println("After Sorting");
        Arrays.sort(x);
        print(x);

    }
    public static void print(int []x){
        for(int i = 0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
}
