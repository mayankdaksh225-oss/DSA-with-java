public class check_right_element_is_greater {
    public static void main(String[] args) {
        int [] arr ={ 4,7,2,9,5};
        for(int i = 0; i<arr.length-1; i++){
                if(arr[i]<arr[i+1]){
                    System.out.println(arr[i]);
                }
        }
    }
}
