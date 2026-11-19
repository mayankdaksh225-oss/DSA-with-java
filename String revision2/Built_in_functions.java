package String_revision;
public class Built_in_functions {
    static void main() {
        // Built in functions , these are the default functions
//        String s = "Vocabulary";
//        System.out.println(s.charAt(4));
//        System.out.println(s.length());
//        System.out.println(s.indexOf('a'));
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
////        System.out.println(s.contains("Vocal"));
//        if(s.contains("cabular")==true){
//            System.out.println("haa he ");
//        }else{
//            System.out.println("nahi he");
//        }

//        System.out.println(s.startsWith("cab"));
        String a = "Mayank";
        String b = "Singh";
//        System.out.println(a.compareTo(b));

        // compare(a,a) functions made by me
        System.out.println(compare(a,a));
        System.out.println(b.concat(a));
    }
    public static int compare(String a, String b){
        int sa = a.length();
        int sb = b.length();
        int i = 0;
        int j = 0;
        int diff = 0;
        while(i<sa && j<sb){
            if(a.charAt(i) != b.charAt(j)){
                char f = a.charAt(i);
                char s = b.charAt(j);
                diff = (int)f-(int)s;
                return diff;
            }
            i++;
            j++;
        }
        if(i<a.length()){
            int k = i;
            while(i<a.length()){
                i++;
            }
            return i-k;
        }
        if(j<b.length()){
            int k = j;
            while(j<b.length()){
                j++;
            }
            return j-k;
        }
        return diff;
    }
}
