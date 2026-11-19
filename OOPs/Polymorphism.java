public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika");
        }
    }
    static void main() {
        // Ek naam Alag Alag kaam
        Dog d = new Dog();
        Cat c = new Cat();
        Human h = new Human();
        Pikachu p = new Pikachu();

        d.speak();
        c.speak();
        h.speak();
        p.speak();
    }
}
