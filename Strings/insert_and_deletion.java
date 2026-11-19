public class insert_and_deletion {
    static void main() {

        String s = "Singh";
        StringBuilder str = new StringBuilder(s);
        str.insert(5,'a');
        System.out.println(str);
        str.deleteCharAt((5));
        System.out.println(str);


    }
}
