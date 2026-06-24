class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eats");
    }

}
class Cat extends Animal{
    void eat(){
        System.out.println("cat eats");
    }
}
public class PolymorphismDemo{
    public static void main(String[] args){
        Animal a;
        a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
    }
}