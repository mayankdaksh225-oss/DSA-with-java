public class remove_space {
    static void main() {
        String a = "I love java";
        StringBuilder sb = new StringBuilder(a);
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) != ' ') {
                System.out.print(sb.charAt(i));
            }
        }
    }
}
