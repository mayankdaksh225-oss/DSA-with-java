public class Maximum_Of_Three_number {
    public static void max(int a, int b, int c){
//        if(a>b){
//            if(a>c){
//                System.out.println(a+" is greatest");
//            }else{
//                System.out.println(c+" is greatest");
//            }
//        }else{
//            if(b>c){
//                System.out.println(b+" is greatest");
//            }else{
//                System.out.println(c+" is greatest");
//            }
//        }
        int max = Math.max(Math.max(a,b),c);
        System.out.println("Maximum is: "+max);
    }
    public static void main(String[] args) {
        max(4577,388,299);

    }
}
