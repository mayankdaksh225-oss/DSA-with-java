import java.util.ArrayList;
import java.util.Scanner;

public class Fist_and_LastOccurrence {
    static void main() {
        Scanner input = new Scanner(System.in);
        int [] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.print("Enter which element do you want to check: ");
        int x = input.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        int low = 0; int hi = arr.length-1;int index = -1;
        while(low<=hi) {

            int mid = (low + hi) / 2;
            if (arr[mid] > x) hi = mid - 1;
            if (arr[mid] < x) low = mid + 1;
            if (arr[mid] != x) {
                ans.add(-1);
            } else {
                index = mid;
                hi = mid - 1;
            }
        }
        ans.add(index);
        System.out.println(ans);


    }
}
