public class Palindrom_check {
    static void main() {
        String s = "racecar";
        char [] arr = s.toCharArray();
        int i = 0; int j = arr.length-1;
        while(i<=j){
            if(arr[i] != arr[j]) {
                System.out.println("Not Palindrome");
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
