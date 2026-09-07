public class shift_Zeroes_in_End {
    public static void main(String[] args) {
        int [] arr = {12,3,42,0,44,0,0,41};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                System.out.print(arr[i]+" ");
            }else{
                count += 1;
            }
        }
        for(int j = 0; j<count; j++){
            System.out.print("0"+" ");
        }
    }
}
