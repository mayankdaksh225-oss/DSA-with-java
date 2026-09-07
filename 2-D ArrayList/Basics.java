import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3); a.add(2); a.add(33); a.add(88);
        List<Integer>b = new ArrayList<>();
        b.add(66); b.add(44); b.add(32); b.add(8);
        List<Integer>c = new ArrayList<>();
        c.add(32); c.add(13); c.add(39); c.add(80);
       List<List<Integer>> arr = new ArrayList<>();
       arr.add(a);
       arr.add(b);
       arr.add(c);
       arr.add(new ArrayList<>());
       arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);
       //System.out.println(arr);
        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // By for each loop
//        for(ArrayList<Integer> list: arr){
//            for(int ele: list){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
    }
}
