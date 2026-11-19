public class Interning_and_new_key_words {
    static void main() {
        // In this we check Nature of the Strings
        String a = "Guddu";
        String b = "Guddu";
//        System.out.println(a==b);
        // This gives true Because a and b are directionate a single string called Guddu
        // and String a and b are same strings , these are one not two Strings Because these are Equals
        // Means, Here is no Extra String will made Because Both values are same;

        // But this expression will make a new String
        String c = new String ("Guddu");
        System.out.println(a==c);
        // These are not equal, Because (a==c) fetch a Location of String by the making of new Strings

        // We will equal to all Strings by these expression(s1.equals(s2));
        String s1 = new String ("Mayank");
        String s2 = new String ("Mayank");
        System.out.println(s1.equals(s2));




    }
}
