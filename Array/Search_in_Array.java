import java.util.Scanner;

public class Search_in_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int [] arr = new int[n];
        System.out.print("Enter Array Elements: " );
        for(int i = 0; i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Which Element Do you want to check: ");
        int p = input.nextInt();

//        boolean flag = false;
        int found = -1;
        for(int j = 0; j<arr.length; j++){
            if(arr[j] == p)
//                flag = true;
            found = j;
        }
        if(found!=-1) System.out.println("Element Exist in Array at "+found+" index");
        else System.out.println("Element does not exist");
    }
}
