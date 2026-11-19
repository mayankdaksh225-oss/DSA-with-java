import java.util.ArrayList;

public class Remove_all_even_numbers {
    static void main() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4); b.add(5); b.add(6);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(7); c.add(8); c.add(9);
        arr.add(a); arr.add(b); arr.add(c);

        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.get(i).size(); j++){
                if(arr.get(i).get(j)%2 == 0) System.out.print("  ");
                else System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
