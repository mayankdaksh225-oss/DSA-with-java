class Avenger{
    String name;
    private int power;
    int hp;
    Avenger(String name,int power,int hp){
        this.name = name;
        this.power = power;
        this.hp = hp;
    }
    int getpower(){
        return power;
    }
    void setpower(int power){
        this.power= power;
    }
    Avenger(){

    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Power: "+power);
        System.out.println("H.P: "+hp);
    }
}
public class RevisionofOOPS {

    static void main() {
        Avenger thor = new Avenger("Thor",80,90);
        thor.print();

        Avenger Hulk = new Avenger("Hulk",90,100);
//        System.out.println(Hulk.getpower());
       Hulk.setpower(98);
        Hulk.print();

        Avenger D_Strange = new Avenger("D.Strange",50,40);
       D_Strange.setpower(99);
//        System.out.println(D_Strange.getpower());
        D_Strange.print();
        Avenger Spiderman = new Avenger();
        Spiderman.name = "Spiderman";
        Spiderman.setpower(89);
        Spiderman.hp = 90;
        Spiderman.print();



    }
}
