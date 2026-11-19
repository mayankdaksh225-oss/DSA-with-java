import java.util.Scanner;

public class User_define_data_type {
   public static class Student{
        String name;
        int Rno;
        double cgpa;
        void print(){
            System.out.print(name+" "+Rno+" "+cgpa);
        }
    }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Student s1 = new Student();
       System.out.print("Name of student: ");
       s1.name=sc.nextLine();
       System.out.print("Roll no.");
       s1.Rno = sc.nextInt();
       System.out.print("CGPA: ");
       s1.cgpa = sc.nextDouble();
//       change(s1);
//       System.out.println(s1.name+" "+s1.Rno+" "+s1.cgpa);
       s1.print();
//       show(s1);



//       Student s2 = new Student();
//       s2.name="Kunal";
//       s2.Rno = 88;
//       s2.cgpa = 10;
//       System.out.println(s2.name+" "+s2.Rno+" "+s2.cgpa);
   }
//   public static void change(Student s1){
//       s1.Rno = 90;
//
//   }
//public static void show(Student s1){
//    System.out.print(s1.name+" "+s1.Rno+" "+s1.cgpa);
//}
}

