import java.util.Arrays;

public class Missing_in_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i<n+1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
