import java.util.Scanner;

public class Algorithm_of_binary {
    static void main() {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7};
        System.out.print("Enter number: ");
        int k = input.nextInt();
        int n = arr.length;
        int lo = 0; int hi = n-1;
        int index = -1; int found = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>k) {
                hi = mid-1;
            }
            if(arr[mid]<k) {
                lo = mid+1;
            }else{
                index = mid;
                found  = arr[mid];
                break;
            }


        }
        System.out.print("Target found "+found+" at index "+index);
    }
}
