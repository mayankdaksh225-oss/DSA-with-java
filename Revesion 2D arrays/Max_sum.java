public class Max_sum {
    static void main() {
        int [][] arr = {{12,3,44,4},{45,32,47,11,89},{15,77,88,56,90},{13,42,4,5,3}};

        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i<arr.length; i++){
//            int add= 0;
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<arr[i].length; j++){
//                add+=arr[i][j];
                if(arr[i][j]>max){
                    max = arr[i][j];
                }

            }
            System.out.println(max);
            if(max<min){
                min=max;
                index = i;
            }
//            if(add>max){
//                max = add;
//                index = i;
//            }
        }
//        System.out.println("Max sum "+max+" of index "+index);
        System.out.println("Min "+min+" of index "+index);

    }
}

