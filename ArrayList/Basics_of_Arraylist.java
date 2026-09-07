import java.util.ArrayList;

public class Basics_of_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(88);
        arr.add(8);
        arr.add(90);
        arr.add(883);
        arr.add(32);
        arr.add(8822);
        System.out.println(arr.get(4));
        arr.set(3,33);
        System.out.println(arr.get(3));

        // For printing ArrayList
//        System.out.println(arr);

        //For printing Arraylist by for loop
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();
        //By For each loop
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
