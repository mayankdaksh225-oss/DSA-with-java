import java.util.Scanner;

public class Greatest_Element_in_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = input.nextInt();

        int [] arr = new int[n];

        System.out.print("Enter array Elements: ");
        for(int i = 0; i<arr.length; i++ ){
            arr[i] = input.nextInt();

        }
        // for MAXIMUM Elements
        int max = Integer.MIN_VALUE;
        for(int j = 0; j<arr.length; j++) {
            if (arr[j] > max)
                max = arr[j];
        }
        System.out.println("max is: "+ max);



        // for MINIMUM ELEMENTS
//        int min = arr[0];
//        for(int j = 0; j<arr.length; j++) {
//            if (arr[j] <min)
//                min = arr[j];
//        }
//
//
//        System.out.print("max is: "+min);


    }
}
