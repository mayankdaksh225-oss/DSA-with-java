public class Count_vowel {
    static void main() {
        String c = "Computer";
        StringBuilder sb = new StringBuilder(c);

        int count = 0;
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='o'||sb.charAt(i)=='u' || sb.charAt(i) == 'i'){
                count++;
            }


        }
        System.out.println(count+"vowels");
    }
}
