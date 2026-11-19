import java.util.ArrayList;

public class Rearrange_element {
    static void main() {
//        int [] arr= {3,1,-2,-5,2,-4};
//        int n =arr.length;
//        int [] ans = new int[n];
//            // Positive array
//            int [] a = new int[n/2];
//            int ia = 0;
//            for(int i = 0; i<n; i++){
//                if(arr[i]>0){
//                    a[ia]=arr[i];
//                    ia++;
//                }
//            }
////            for(int ele:a){
////                System.out.print(ele+" ");
////        }
//
//        // Negative array
//        int [] b = new int[n/2];
//        int ib = 0;
//        for(int j = 0; j<n; j++){
//            if(arr[j]<0){
//                b[ib] = arr[j];
//                ib++;
//            }
//        }
//
////        for(int ele:b){
////            System.out.print(ele+" ");
////        }
//
//        // Merge both arrays
//        int  p =0,q=0,k=0;
//        while(k<n-1){
//            ans[k++]=a[p++];
//            ans[k++]=b[q++];
//
//        }
//        for(int ele: ans){
//            System.out.print(ele+" ");
//        }



        // Second code

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);arr.add(1);arr.add(-2); arr.add(-5); arr.add(2); arr.add(-4);
        int n =arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        // Positive array
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(ans.get(i)>0){
                a.add(ans.get(i));

            }
        }

        // Negative array
        ArrayList<Integer> b = new ArrayList<>();

        for(int j = 0; j<n; j++){
            if(ans.get(j)<0){
                b.add(ans.get(j));

            }
        }

        // Merge both arrays
        int  p =0,q=0,k=0;
        int c = ans.size();
        while(k<c-1){
            ans.set(k,a.get(p));
            k++;
            p++;
            ans.set(k,b.get(q));
            k++;
            q++;
        }
        System.out.println(ans);
    }
}
