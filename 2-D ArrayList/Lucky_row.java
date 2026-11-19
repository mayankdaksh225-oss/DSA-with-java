import java.util.ArrayList;

public class Lucky_row {
    static void main() {
        ArrayList<ArrayList<Integer>> d= new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(45); a.add(20);a.add(88);a.add(90);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(80); b.add(30); b.add(60);b.add(99);b.add(56);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(14); c.add(90); c.add(40);c.add(80);c.add(70);
        d.add(a); d.add(b); d.add(c);

        boolean flag = true;
        for(int i = 0; i<d.size(); i++){
            for(int j = 0; j<d.get(i).size(); j++){
                if(d.get(i).get(j)%2==0){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
           if(flag) System.out.println("Row is "+i);
        }
    }
}
