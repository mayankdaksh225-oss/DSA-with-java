public class First_Repeating_Element {
    public static void main(String[] args) {
        int [] arr = {5,3,4,3,5,2};
        int n  = arr.length;

        int t = 0;
        int fre = Integer.MAX_VALUE;
        for(int i = 0; i <n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i] == arr[j]){
                    t = j;
                }
            }
            if(t<fre){
                fre = t;
            }
        }
        if(fre == 0) System.out.print("No Repeating Element ");
        else System.out.print(arr[fre]);
    }
}
