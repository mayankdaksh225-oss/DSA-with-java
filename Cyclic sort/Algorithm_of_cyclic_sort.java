public class Algorithm_of_cyclic_sort {
    static void main() {
        int [] arr = {3,1,5,2,7,0,4,6};
        int i = 0,n= arr.length;
        while(i<n) {
            if (arr[i]==i){
                i++;
            }else{
                int idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
