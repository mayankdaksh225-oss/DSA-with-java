package String_revision;

public class count_no_of_vowel {
    static void main() {
        String s = "Long walk to freedom DSA In Java | Strings | Java in One Shot | Strings in Java";
        int count =0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
                count++;
            }
        }
        System.out.println(count+" Vowels");
    }
}
