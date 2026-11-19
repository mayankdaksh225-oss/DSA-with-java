import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Maximum_sum_of_which_row {
    static void main() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(45); a.add(20);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(80); b.add(30); b.add(60);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(15); c.add(90); c.add(40);
        arr.add(a); arr.add(b); arr.add(c);

        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.size(); i++ ) {
            int sum = 0;
            for (int j = 0; j < arr.get(i).size(); j++) {
                sum += arr.get(i).get(j);
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println("Row "+index+" Maximum of "+max);
    }
}
