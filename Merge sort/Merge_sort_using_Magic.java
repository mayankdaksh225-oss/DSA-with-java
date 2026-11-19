public class Merge_sort_using_Magic {
    static int count = 0;
    public static void main(String[] args){
        int [] arr = {10,10,20,60,80,90,50,100,70,40};
        mergesort(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.print("Comparison in this code is: "+count);
    }
    static void mergesort(int [] arr) {
        int n = arr.length;
        if(n==1) return;
        int [] a = new int[n/2];
         int [] b = new int[n-n/2];
         int idx = 0;
         for(int i = 0; i<a.length; i++) a[i] = arr[idx++];
         for(int j = 0; j<b.length; j++) b[j] = arr[idx++];
         mergesort(a);
         mergesort(b);
         merge(a,b,arr);

    }
    public static void merge(int [] a, int[] b, int [] arr){
        int i = 0; int j = 0; int k  = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) arr[k++]=a[i++];
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
        count++;
    }

}
