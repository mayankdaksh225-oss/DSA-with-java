package String_revision;

public class Substring {
    static void main() {
//        String s = "Mayanksingh";
//        System.out.println(s.substring(0));
        String s = "Mayank";
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
