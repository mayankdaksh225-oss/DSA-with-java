public class Second_Maximum_Element {
    public static void main(String[] args) {
        int [] arr = {34,  54, 32 ,2,232,2,44,2};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Maximum is: "+max);
        for(int j = 0; j<arr.length; j++){
            if(arr[j]>smax && arr[j]!=max)
                smax = arr[j];
        }
        System.out.println("Second maximum Element is "+smax);
    }
}
