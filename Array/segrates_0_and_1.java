public class segrates_0_and_1 {
    public static void main(String[] args) {
        int [] arr = {1,0,0,1,0};
//        for(int i = 0; i<arr.length; i++) {
//            for(int j = 0; j<arr.length-1; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
