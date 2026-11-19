public class take_as_a_refrence {
    static void main() {
        int [] arr = {4,3,4,32,553,53};
        System.out.println(arr[4]);
        change(arr);
        System.out.println(arr[4]);
    }
    public static void change(int []arr){
       arr[4] = 900;

    }

}
