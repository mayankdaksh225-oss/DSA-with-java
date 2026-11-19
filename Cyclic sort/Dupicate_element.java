import java.util.ArrayList;

public class Dupicate_element {

    static void main() {
        ArrayList<Integer> ans = new ArrayList<>();
//        int [] arr = {2,3,1,2,3};
        int [] arr = {32, 28, 33, 30, 35, 27, 19, 37, 32, 30, 39, 10, 24, 44, 1, 37, 13, 29, 22, 20, 33, 9, 21, 25, 13, 41, 25, 2, 31, 14, 40, 7, 35, 19, 11, 45, 22, 18, 29, 18, 6, 10, 12, 44, 39, 24};
        int i = 0,n = arr.length;
        while(i<n) {
            int idx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[idx] == arr[i]) {
                i++;
            } else {

                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;

            }
        }
        for(int j = 0; j<n;j++){
            if(arr[j]!=j+1) ans.add(arr[j]);
        }
        System.out.println(ans);

    }
}
