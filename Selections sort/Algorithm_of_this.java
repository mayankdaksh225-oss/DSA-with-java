public class Algorithm_of_this {
    static void main() {
        int []arr = {8,4,1,-3,6,5};
        for(int i = 0; i<arr.length-1; i++){
            int min = Integer.MAX_VALUE;
            int indx = -1;
            for(int j = i; j<arr.length; j++){
                if(arr[i]<min){
                    min = arr[i];
                    indx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indx];
            arr[indx] = temp;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
