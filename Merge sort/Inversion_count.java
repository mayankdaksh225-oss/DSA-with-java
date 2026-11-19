import java.util.ArrayList;

public class Inversion_count {
    static void main() {
        int [] arr = {24, 18, 38, 43, 14, 40, 1, 54};
        int n = arr.length;

        int count = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++) {
                if(arr[i]>arr[j]){

                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
