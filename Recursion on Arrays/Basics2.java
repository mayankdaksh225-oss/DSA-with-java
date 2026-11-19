public class Basics2 {
//    static void main() {
//        int [] arr = {4,3,5,2,6,4,7};
//      print(arr,0);
//    }
//    public static void print(int []arr,int index){
//        int n = arr.length;
//        if(index==n) return;
//        print(arr,index+1);
//        System.out.print(arr[index]);
//
//    }
static void main() {
    int [] arr = {8,43,5,6,3,32,4,5,4,53};
    int ele = 8;
    find(arr,ele,0);
}
public static void find(int [] arr,int ele,int index){
    if(index == arr.length){
        System.out.println("false");
        return;
    }

    if(arr[index] == ele){
        System.out.println("true");
        return;

    }

    else find(arr,ele,index+1);
}

}
