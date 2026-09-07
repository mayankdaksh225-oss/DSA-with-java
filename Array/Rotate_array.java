import java.util.Scanner;

public class Rotate_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {6,8,1,2,4,9,0,};
        int n = arr.length;
        System.out.print("How many times: ");
        int p = input.nextInt();
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        int l= 0;
        int k = n-p-1;
        while(l<k){
            int temp = arr[l];
            arr[l] = arr[k];
            arr[k] = temp;
            l++;
            k--;
        }
        int e = n-p;
        int w = n-1;
        while(e<w){
            int temp = arr[e];
            arr[e] = arr[w];
            arr[w] = temp;
            e++;
            k--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
