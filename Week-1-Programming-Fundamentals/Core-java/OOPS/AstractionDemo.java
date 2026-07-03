
abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class AstractionDemo{
    public static void main(String[] args){
        Animal d=new Dog();
        d.sound();
       
    }
}











