public class Binary_search_by_recursion {
    static void main() {
        int [] arr = {1,3,4,32,45,66,76,89,90,91,93,99};
        int target = 5;
        binary(arr,target);
    }
    public static int binary(int [] arr,int target){
        int n = arr.length-1;
        int lo = 0;
        System.out.println( helper(arr,target,0,n));
        return 0;
    }
    public static int  helper(int [] arr,int target,int lo, int hi){
        if(lo==hi) return -1;
        int mid = (lo+hi)/2;
        if(target<arr[mid]) return helper(arr,target,lo,mid-1);
        else if(target>arr[mid]) return helper(arr,target,mid+lo,hi);
        else return mid;
    }
}
