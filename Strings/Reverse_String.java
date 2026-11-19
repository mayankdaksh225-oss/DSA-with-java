public class Reverse_String {
    static void main() {
        String s = "Mayank";
        StringBuilder str = new StringBuilder(s);
        int i = 0; int j = str.length()-1;
        while(i<=j){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(str);

        // Reverse String
        String a = "Singh";
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        System.out.println(sb);
    }
}
