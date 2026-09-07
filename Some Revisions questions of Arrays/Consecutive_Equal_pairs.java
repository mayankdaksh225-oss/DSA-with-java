public class Consecutive_Equal_pairs {
    public static void main(String[] args) {
        int []  arr = {11,23,44,44,43,2,33,33,56,56};
        int count = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(i<n-1) {
                if (arr[i] == arr[i + 1]) {
                    count += 1;
                }
            }
        }
        System.out.print(count+" consecutive pairs, We have");
    }
}
