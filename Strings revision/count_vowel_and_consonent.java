public class count_vowel_and_consonent {
    static void main() {
        int vowels = 0;
        int consonent = 0;
        String s = "Banana";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowels++;
            }else{
                consonent++;
            }
        }
        System.out.println("vowels are: "+vowels+ " consonents are: "+ consonent);
    }
}
