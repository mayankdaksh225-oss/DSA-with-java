import java.util.ArrayList;

public class create_an_2_D_Array {
    static void main() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4); a.add(9); a.add(0); a.add(8);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(2); b.add(3); b.add(4);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1); c.add(4); c.add(8); c.add(8);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(5); d.add(2); d.add(0); d.add(7);

        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);


        // BY FOR EACH LOOP
//        for(ArrayList<Integer> row:arr){
//            for(int value:row){
//                System.out.print(value+" ");
//            }
//            System.out.println();
//        }


        // BY FOR LOOP ONLY
        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
