import java.util.Scanner;

public class Sum_Of_two {
    public static void main(String[] args) {
        int [] arr = {1,5,8,-3};
//        boolean found = false;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == 2) {
//                    found = true;
                    System.out.println("sum of 2 by" + arr[i] + " and " + arr[j]);
                }
                break;


            }

        }
//        if(found) System.out.println("Achieved by ");
//        else System.out.println("Not Achieved");

    }
}
