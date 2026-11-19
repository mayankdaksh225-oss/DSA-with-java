import java.util.ArrayList;

public class String_Builder {
    static void main() {
//        ArrayList<Character> str = new ArrayList<>();
//        str.add('M');
//        str.add('a');
//        str.add('y');
//        str.add('a');
//        str.add('n');
//        str.add('k');
//        str.set(2,'a');
//        str.set(5,'u');
//        System.out.println(str);

        // But we Study about StringBuilder

//        StringBuilder s = new StringBuilder();
//        System.out.println(s.length()+" "+s.capacity());
//        s.append("Mayank");
//        System.out.println(s.length()+" "+s.capacity());
//        System.out.println(s);
//        s.append("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqi");
//        System.out.println(s.length()+" "+s.capacity());
//        s.append("ihdf");
//        System.out.println(s.length()+" "+s.capacity());


        String s = "Hanuman";
       StringBuilder ans = new StringBuilder(s);
//        System.out.println(ans.append("ansh"));
//        System.out.println(ans.reverse());
//        System.out.println(ans.delete(4,7));
        s = ans.toString();
        System.out.println(s);


    }
}
