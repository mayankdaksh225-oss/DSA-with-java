public class Array_Basics {
    public static void main(String[] args) {
        // PRINTING AND INDEXING
//        int [] x = { 3,4,5,6,75,7};
//        System.out.println(x[4]);

        // UPDATING VALUES IN ARRAY
//        x[5] = 55;
//        System.out.println(x[5]);


//        int x = 78;
//        int y = x;
//        y = 33;
//        System.out.println(x);
//        System.out.println(y);

        int []arr = {1,2,3,4,5};
        int [] k = arr;
        k[2] = 6;
        System.out.println(arr[2]);
    }
}
