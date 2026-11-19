public class Missing_in_array {
    static void main() {
        int [] arr = {8,2,4,5,3,7,1};
        int i = 0; int n = arr.length;
        while(i<n){
            if(arr[i]==i+1 || arr[i]>n){
                i++;
            }else{
                int index = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        for(int j = 0; j<n; j++){
            if(arr[j]!=j+1){
                System.out.print(j+1+" is missing");
            }
        }
    }
}
