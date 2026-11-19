import java.util.Scanner;

public class Search_element_in_Descending_order {
    static void main() {
        Scanner input = new Scanner(System.in);
        int [] arr = {100,91,87,76,66,52,43,35,29,13,5};

        System.out.print("Element, Do you want to check: ");
        int x = input.nextInt();
        int low = 0; int hi = arr.length-1;int index = -1;
        int found = -1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid]>x) {
                low = mid+1;
            }else {
                if(arr[mid]<x){
                    hi = mid-1;
                }else{
                    index = mid;
                    found = arr[mid];
                    break;
                }
            }
        }
        System.out.print("Element found "+found+" at index "+index);

    }
}
