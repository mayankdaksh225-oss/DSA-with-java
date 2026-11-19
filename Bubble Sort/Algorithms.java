public class Algorithms {
    static void main() {
        int [] arr = {7,3,4,7,8,1};
        for(int i = 0; i<arr.length; i++){
            int swap = 0;
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.print("Already sorted");
                break;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
