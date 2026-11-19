public class Algorithm_of_Quick {
    static void main() {
        int [] arr = {1, 4, 7, 7, 8, 5, 1, 6, 8};
        int s = 0;
        int e = arr.length-1;
        quicksort(arr,s,e);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void quicksort(int [] arr , int low, int high){
        int s = low;
        int e = high;
        if(s>=e){
            return;
        }
        int pi = partition(arr,s,e);
        quicksort(arr,s,pi-1);
        quicksort(arr,pi+1,e);
    }
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public  static int partition(int []arr,int low,int high){
        int s = low;
        int e = high;
        int pivele = arr[s];
        int count = 0;
        for(int i = s+1; i<=e; i++){
            if(arr[i]<=pivele){
                count++;
            }
        }
        int correctpos = s+count;
        swap(arr,s,correctpos);
        int u = s; int j =e;
        while(u<correctpos && j>correctpos){
          while(arr[u]<pivele && u<correctpos ){
              u++;
          }
          while(arr[j]>pivele && j>correctpos){
              j--;
          }
          if(u<correctpos && j>correctpos){
              swap(arr,u,j);
              u++;
              j--;
          }
        }
        return correctpos;

    }
}
