public class Find_max_ele {
    static void main() {
        int [][] arr = {{12,3,44,4},{45,32,47,11,89},{15,77,88,56}};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("So,the Biggest element is : "+max);
    }
}
