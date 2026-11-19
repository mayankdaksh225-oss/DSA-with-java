public class Constructors {
    public static class Studentdata {
        String name;
        int rno;

        Studentdata(int rno, String name) {
            this.name = name;
            this.rno = rno;
        }

        Studentdata(String s, int x) {
            name = s;
            rno = x;
        }

        Studentdata() {

        }

        void print() {
            int rno = 8;
            System.out.println(name + " " + this.rno);
        }
    }
    static void main() {
        Studentdata s1 = new Studentdata(3,"Mayank");
        s1.print();
        Studentdata s2=new Studentdata("Bisleri",2);
        s2.print();
        Studentdata s3 = new Studentdata();


    }
}
