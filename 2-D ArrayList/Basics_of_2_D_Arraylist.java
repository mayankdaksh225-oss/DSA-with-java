import java.util.ArrayList;

public class Basics_of_2_D_Arraylist {
    static void main() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a= new ArrayList<>();
        a.add(1);a.add(3);a.add(4);
        ArrayList<Integer> b= new ArrayList<>();
        b.add(5);b.add(6);b.add(7);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(0);c.add(44); c.add(23);

        arr.add(a);arr.add(b);arr.add(c);
//        System.out.println(arr);

        // BY FOR LOOP
//        for(int i = 0; i<arr.size(); i++){
//            for(int j = 0; j<arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        // For print any individual element
        System.out.println(arr.get(1).get(2));

        // For set any value
        arr.get(1).set(1,33);
        arr.get(1).set(2,89);

        // FOR ADD ANY NUMBER IN ARRAYLIST
        arr.get(2).add(90);

        // Create any Arraylist
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(90);
        arr.get(arr.size()-1).add(32);
        arr.get(arr.size()-1).add(88);
        arr.get(arr.size()-1).add(80);


        System.out.println(arr);
    }
}
