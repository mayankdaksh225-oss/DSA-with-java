public class Print_First_element_greater_than_50 {
    public static void main(String[] args) {
        int [] arr = {12,3,34,2,44,56,43,51};
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>50){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
