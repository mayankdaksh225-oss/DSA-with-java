public class Duplicate_element {
    static void main() {
//        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int [] arr = {1, 1, 2, 3, 4};
//        int [] arr = {1, 2, 2, 3, 4};
//        int [] arr ={1, 2, 3, 3, 4, 5};
//        int [] arr ={1, 2, 3, 4, 4, 5, 6};
//        int [] arr ={1, 1, 2, 2, 3, 4};
//        int [] arr = {1, 2, 2, 2, 3, 4};
//        int [] arr ={1, 2, 3, 4, 5, 5};
//        int [] arr ={1, 2, 3, 4, 5, 6, 6};
//        int [] arr ={1, 2, 3, 4, 4, 5, 5, 6};
//        int [] arr ={1, 1, 2, 2, 3, 3, 4, 4};
        int count = 0;
        for(int i =0; i<arr.length; i++){
            count++;
            if(i!=arr.length-1) {
                while (arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
