class Complex{
    int x;
    int y;
    Complex(int x,int y){
        this.x=x;
        this.y=y;

    }
    void add(Complex c2){
        x+=c2.x;
        y+=c2.y;

    }
    void multiplY(Complex z){
       int real =x*z.x - y*z.y;
       int complex=x*z.y + y*z.x;

       x = real;
       y = complex;
    }
    void divide(Complex z){
        int real = x*z.x - x*z.y;
        int complex = y*z.x + y*z.y;
        int den = z.x*z.x + z.y*z.y;
        x=real;
        y=complex;
        System.out.println(x+"/"+den+ y+"/"+den);
    }
    void print(){
        if(y>0)System.out.println(x+"+"+y+"i");
        else System.out.println(x+"-"+(-y)+"i");
    }
}
public class Questions {
    static void main() {
        Complex c1 = new Complex(8,-9);
        c1.print();
        Complex c2 = new Complex(9,7);
        c2.print();

//        c1.add(c2);
//        c1.print();
//        c2.multiplY(c1);
//        c2.print();
        c1.divide(c2);
    }
}
