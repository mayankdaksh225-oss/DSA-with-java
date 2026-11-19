public class Algorithm {
    static void main() {
        int [] arr = {5,4,6,8,2,9,1,0};
        for(int i = 1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        int m = Integer.MAX_VALUE;
    }
}
