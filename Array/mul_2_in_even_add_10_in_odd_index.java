public class mul_2_in_even_add_10_in_odd_index {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,7,5,4};
        for(int i = 0; i<arr.length; i++){
            if(i%2 == 0) {
                System.out.print(arr[i]*2 + " ");
            }
            else {
                System.out.print(arr[i]+10 + " ");
            }
        }
    }
}
