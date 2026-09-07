public class Print_Even_Index_Elements {
    public static void main(String[] args) {
        int [] arr = { 1,22,34,53,53,6,55,3};
        for(int i = 0; i<arr.length; i++){
            if(i%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
