public class remove_dupicate {
    static void main() {
        int [] arr = {0,0,1,1,1,2,2,3,3,4,4,4,5,5,5,6,6,6,7,8,9};
        int i = 0;
        int j = i+1;
        int n= arr.length;
        int count = 1;
        if(n==0){
            count = 0;
        }
        while(j<n){
            if(arr[j]==arr[i]){
                j++;
            }else{
                count++;
                i=j;
                j=i+1;
            }
        }
        System.out.println(count);
    }
}
