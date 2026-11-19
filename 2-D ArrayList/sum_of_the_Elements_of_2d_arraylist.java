import java.util.ArrayList;

public class sum_of_the_Elements_of_2d_arraylist {
    static void main() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(90);a.add(4);a.add(45); a.add(32);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);b.add(43);b.add(0);b.add(88);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(90);c.add(43);c.add(32);c.add(44);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(90);d.add(8);d.add(2);d.add(2);

        arr.add(a); arr.add(b); arr.add(c); arr.add(d);

        int sum = 0;

        for(int i = 0; i<arr.size(); i++){
            for(int j= 0; j<arr.get(i).size(); j++){
                sum += arr.get(i).get(j);
            }
        }
//        for(ArrayList<Integer> row:arr){
//            for(int value: row){
//                sum +=value;
//            }
//        }
        System.out.println("The sum is: "+sum);

    }

}
