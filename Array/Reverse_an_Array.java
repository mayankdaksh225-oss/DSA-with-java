public class Reverse_an_Array {
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 2, 4, 9,78};

        int j =arr.length-1;
        for(int i = 0; i<arr.length; i++ ){
            if(i<j) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
