public class Check_array_is_Palindrome {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,4,4,2,1};
        int n = arr.length;
        int j = n-1;
        boolean flag = false;
        for(int i = 0; i<n; i++) {
            if(i<j){
                if(arr[i]-arr[j] == 0){
                    flag = true;


                }else{
                    flag = false;
                    break;
                }

            }
            j--;

        }
//        int i = 0;
//       while(i<j){
//           if(arr[i]-arr[j] == 0){
//               flag = true;
//           }else{
//               flag = false;
//           }
//
//           i++;
//           j--;
//
//       }
        if(flag == true) System.out.println(" Yes, This Array is Palindrome");
        if(flag == false) System.out.println(" No, This Array is not Palindrome");
    }
}
