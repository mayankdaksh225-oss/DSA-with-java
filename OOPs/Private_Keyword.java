import java.util.Scanner;

class Students{
    String name;
    private int rno = 9;
    double cgpa;
     void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
    int getrno(){
         return rno;
    }
    void Setrno(int x){
         rno = x;
    }
//    void p(){
//        print();
//    }

}
public class Private_Keyword {
    static void main() {
        Scanner input = new Scanner(System.in);
        Students s1 = new Students();
        s1.name = "Mayank";
        s1.cgpa = 8;
        // This is For, When any attribute is private in nature
        System.out.println(s1.getrno());
        // This is for, When we want to change private attribute
        s1.Setrno(26);
        s1.print();


    }
}
