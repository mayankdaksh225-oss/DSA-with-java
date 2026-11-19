import java.util.ArrayList;

public class Basics_of_2d_arraylist {
    static void main() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(90); a.add(84); a.add(33); a.add(98);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(44); b.add(88); b.add(93); b.add(45);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(92); c.add(20); c.add(80); c.add(87);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(89); d.add(70); d.add(88); d.add(60);

        arr.add(a); arr.add(b); arr.add(c); arr.add(d);


        System.out.println(arr.get(0).get(3));
        System.out.println(arr);
        arr.get(1).set(1,102);
        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
