public class Find_2_sum {
    public static void main(String[] args) {
        int [] arr = {5,8,-1,2};
        int n = arr.length;
        int target= 2;
        boolean found = true;
        for(int i = 0; i<n; i++ ){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    found = false;

                }
            }
        }
        if(found ) System.out.print(" Not found");
        else System.out.print(" found");
    }
}
