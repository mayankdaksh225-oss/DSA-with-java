import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generate_all_binary_String {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<String> ans = new ArrayList<>();
        generate("",0,0,n,ans);
        System.out.println(ans);
    }
    public static List<String> generate(String s, int ze, int on, int n,List<String>ans ){
        if(s.length()==n){
            ans.add(s);
            return ans;
        }
         generate(s+"0",ze+1,on,n,ans);
        generate(s+"1",ze,on+1,n,ans);
        return ans;


    }
}
