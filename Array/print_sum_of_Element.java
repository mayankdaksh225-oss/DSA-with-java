import java.util.Scanner;

public class print_sum_of_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int [] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        // Addition of the Elements
//        int k = 0;
//        for(int j = 0; j<arr.length; j++){
//            k = k+arr[j];
//        }
//        System.out.print("sum is: "+ k);

        // Products of the elements
        int k = 1;
        for(int j = 0; j<arr.length; j++){
            k = k*arr[j];
        }
        System.out.print("sum is: "+ k);
    }
}
