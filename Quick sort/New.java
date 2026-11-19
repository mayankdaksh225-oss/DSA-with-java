public class New {
    static void main() {
        int [] arr = {28078, 19451, 935, 28892, 2242, 3570, 5480, 231};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE+10;
        int n = arr.length;
        for(int i = 0;i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]>secmax && arr[i]!=max){
                secmax = arr[i];
            }
        }
        if(secmax == Integer.MIN_VALUE+10){
            System.out.println("-1");
        }

        System.out.println(secmax);
    }
}
