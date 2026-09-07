public class Passing_Arrays_to_methods {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6};
        System.out.println(x[4]);
        change(x);
        System.out.println(x[4]);

        // In the Case of Arrays, if we change any index of the element in the different function then the result will Also print in main function
    }
    public static void change(int[]x){
        x[4] = 66;
    }
}
