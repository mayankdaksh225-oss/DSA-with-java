public class Replace_Negative_Element_by_Zero {
    public static void main(String[] args) {
        int [] arr = { 1,33,-3,42,-4,-3,44};
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print("0"+" ");
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
}
