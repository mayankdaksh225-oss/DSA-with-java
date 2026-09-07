public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {5,-2,6,7,2,0,7};
        int min = Integer.MAX_VALUE;
        int ind = -1;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    ind = j;

                }
            }
            int temp = arr[i];
            arr[i]  = arr[ind];
            arr[ind] = temp;

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }

}
