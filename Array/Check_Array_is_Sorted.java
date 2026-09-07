public class Check_Array_is_Sorted {
    public static void main(String[] args) {
        int [] arr = {0,9,2,6,4,5};
        boolean flag = false;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                flag = true;
            }else{
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("yes,Array is Sorted ");
        }if(flag == false){
            System.out.println("No, Array is not sorted");
        }
    }
}
