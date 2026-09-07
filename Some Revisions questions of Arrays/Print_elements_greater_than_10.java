public class Print_elements_greater_than_10 {
    public static void main(String[] args) {
        int [] arr = { 12,3,4,53,5,22,53,32,23,11};
        int count = 0;
        for(int i = 0; i<arr.length; i++ ){
            if(arr[i] > 10){
                count +=1;
            }
        }
        System.out.print(count+" element is here");
    }
}
