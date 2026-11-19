import java.util.ArrayList;

public class largest_element_in_each_row {
    static void main() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(45); a.add(20);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(80); b.add(30); b.add(60);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(15); c.add(90); c.add(40);
        arr.add(a); arr.add(b); arr.add(c);


        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.get(i).size(); j++){
                if(arr.get(i).get(j)>max){
                    max = arr.get(i).get(j);
                }
            }
            System.out.println("Row "+i+" = "+max);

        }
    }
}
