public class Sorting {
    public static void main(String[] args) {
        int [] arr = {5,1,8,6,9,0,2,3,4};
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
