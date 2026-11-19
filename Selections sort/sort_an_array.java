public class sort_an_array {
    static void main() {
        int []arr = {7,3,4,7,8,1};
        for(int i = 0; i<arr.length-1; i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j = i; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
