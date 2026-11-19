public class Built_in_functions_in_Strings {
    static void main() {
        String s = "Mayank singh";
        // For print index of any Character
        System.out.println(s.indexOf('s'));  // This function print only First occurence of character


        // For print Last Occurrence of character
        System.out.println(s.lastIndexOf('a'));


        // For Print Small letters of Character
        System.out.println(s.toLowerCase());


        String k = "Harshita";
        System.out.println(k.contains("Harshit"));  // true
        System.out.println(k.contains("harshit"));  // false

        // Check char is in starting or not
        System.out.println(k.startsWith("Har"));

        // For converting capital letters of character
        System.out.println(k.toUpperCase());
    }
}
