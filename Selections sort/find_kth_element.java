import java.util.Scanner;

public class find_kth_element {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Kth element: ");
        int k = input.nextInt();
        int [] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        System.out.println();
        int n = arr.length;
        for(int i = 0; i<k; i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j = i; j<n; j++){
                if(arr[j]<min){
                    min=arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index ];
            arr[index] = temp;
        }
        System.out.print("So, kth element is: "+ arr[k-1]);
    }
}
