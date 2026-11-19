public class String_Immutability {
    static void main() {
        // We heared that we cannot change any individual character of the String But ,
        // By this expression(s.substring(a,b)+'m'+s.subtring(c) we can change any individual character in the String

        String s = "Bishal";
        System.out.println(s.substring(0,0)+'V'+s.substring(1));  // Vishal
        System.out.println(s.substring(0,3)+'m'+s.substring(4));  // Bismal
        System.out.println(s.substring(0,1)+'u'+s.substring(2));  //Bushal


    }
}
