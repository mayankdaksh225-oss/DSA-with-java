public class Basics {
    static void main() {
        int [] arr = {3,53,23,55,6,3,22};
        int ele = 0;
        System.out.println(find(arr,ele,0));
    }
    public static Boolean find(int [] arr,int ele,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==ele) return true;
        else return find(arr,ele,idx+1);







    }
}
