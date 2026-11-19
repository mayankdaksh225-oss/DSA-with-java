class Pokemon{
    int power;
    String type;
    Pokemon(String type, int power){
        this.type = type;
        this.power = power;
    }


    void print(){
        System.out.println("Type: "+type);
        System.out.println("Power: "+power);
    }

}
class LegendaryPokemon extends Pokemon {
    String ability;
    LegendaryPokemon(String type,int power,String ability){
        super(type,power);
        this.type = type;
        this.power = power;
        this.ability = ability;
    }
    @Override
    void print(){
        super.print();
        System.out.println("Ability"+ability);
    }
}
class Godpokemon extends LegendaryPokemon{
    String tag;
    Godpokemon(String tag, int power, String ability , String type){
        super(type,power,ability);
        this.tag = tag;
        this.power = power;
        this.ability = ability;
        this.type = type;
    }
    @Override
    void print(){
        super.print();
        System.out.println("Tag "+tag);
    }
}

public class Inheritance {
    static void main() {
        System.out.println("Mewtwo");
        Pokemon mewtwo = new Pokemon("Electric",79);
        mewtwo.print();
        System.out.println();
        LegendaryPokemon pikachu = new LegendaryPokemon("Fire", 89,"Thunderbolts");
        System.out.println("Pikachu");
        pikachu.print();
        System.out.println();
        System.out.println("Dialga");
        Godpokemon dialga = new  Godpokemon("God",99,"LaserWaves","Frozen");
        dialga.print();
        
    }
}
