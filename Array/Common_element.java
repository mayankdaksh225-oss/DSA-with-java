import java.util.Arrays;

public class Common_element {
    public static void main(String[] args) {
        int [] arr1 = { 3,4,2,2,4};
        int [] arr2 = {3,2,2,7};
        int ind = -1;


        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    ind = j;
                }
            }
        }
        int [] arr3 = new int[ind];
        Arrays.sort(arr3);
        for(int ele: arr3){
            System.out.print(arr3[ind]);
        }
    }
}
