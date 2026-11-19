public class nas {
    public static void isPalindrome(int n) {
        int r = 0;
        System.out.println(helper(0,n,n));
    }
    public static Boolean helper(int r, int n,int check){
        if(n==0) {
            if(check-r==0) return true;
            else return false;
        }
        return helper(r*10+n%10,n/10,check);
    }
}
