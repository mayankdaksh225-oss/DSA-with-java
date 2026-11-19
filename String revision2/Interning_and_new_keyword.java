package String_revision;

public class Interning_and_new_keyword {
    static void main() {
        String s = "Mayank";
        s="singh";
        System.out.println(s);

        // these two string point a same name , here is not t name of String will made a entirely new string

        String a = "Parichaya";
        String b = "Parichaya";
        System.out.println(a);
        // If we want to make a entirely  a new String. So
        String t = new String("Parichaya");
        System.out.println(t);

        String n = "Similarity";
        System.out.println(n.substring(0,0)+'k'+n.substring(1));
    }
}
