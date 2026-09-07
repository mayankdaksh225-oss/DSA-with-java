public class Frequency_with_hashmap {
    public static void main(String[] args) {
        int [] arr = {2,3,2,4,3,2};
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + "=" + count +" times");
            count = 0;
        }
    }
}
