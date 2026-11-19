import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class power_set {
    static void main() {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subset("",s,0,list);
    }
    public static void subset(String ans,String s,int idx,List<String> list  ){

        if(idx==s.length()){
            list.add(ans);

            System.out.println(ans);
            return;
        }
        char ch = s.charAt(idx);
        subset(ans+ch,s,idx+1,list);
        subset(ans,s,idx+1,list);
    }
}
