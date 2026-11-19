public class Constructor2 {
     public static class Studentsdata{
        String name;
        int rno;
        int [] marks;
        Studentsdata(int[] s){
            marks =s;
        }
        void print(){
            for(int ele:marks){
                System.out.print(ele+" ");

            }
            System.out.println();
        }
    }
    static void main() {
         int [] arr = {45,32,33,55};
         int [] brr = {55,66,55,64,67};
        Studentsdata s1 = new Studentsdata(arr);
        s1.print();
        Studentsdata s2 = new Studentsdata(brr);
        s2.print();
//        Studentsdata s2 = new Studentsdata(2);
    }
}
