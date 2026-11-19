public class Move_all_zeroes {
    static void main() {
        int[] arr={1,0,0,3,4,8,0,0,12,0,13};
        int i = 0;
        int j = 1;
        while(j<arr.length){
            if(arr[i]==0){
                if(arr[j]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j=i+1;
                }else{
                    j++;
                }
            }else{
                i++;
                j++;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
