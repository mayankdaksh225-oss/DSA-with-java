public class print_String_without_using_length {
    static void main() {
//        String a = "Hello";
//        char [] arr = a.toCharArray();
//        for(char ele: arr){
//            System.out.println(ele);
//        }

        // Count the number of character
        String b = "Hello";
        char [] arr = b.toCharArray();
        int count = 0;
        for(char ele: arr){
            count++;
        }
        System.out.println(count);
    }
}
