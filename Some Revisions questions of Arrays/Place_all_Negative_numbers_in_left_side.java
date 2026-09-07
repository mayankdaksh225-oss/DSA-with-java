public class Place_all_Negative_numbers_in_left_side {
    public static void main(String[] args) {
        int [] arr ={ 2,-4,5,-1,3,-6,5,6,-9,7,5,6,-87};
        int n = arr.length;
        int d = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]<0){
                int temp = arr[d];
                arr[d] = arr[i];
                arr[i] = temp;
                d++;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
