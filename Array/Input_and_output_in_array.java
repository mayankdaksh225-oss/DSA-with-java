import java.util.Scanner;

public class Input_and_output_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input and output by Automatic
//        int[] arr = {23,45,65,655,43,55,664,33};
//        int n = arr.length;
//        for(int i = 0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }

        // Input and output in Array by Manually
        System.out.print("Enter Array size: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        for(int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
