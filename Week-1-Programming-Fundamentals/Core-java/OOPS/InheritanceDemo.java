class Animal {

    String name = "Animal";


    void eat(){

        System.out.println("Animal is eating");

    }

}



class Dog extends Animal {


    void bark(){

        System.out.println("Dog is barking");

    }

}


  public class InheritanceDemo {

    public static void main(String[] args){


        Dog d = new Dog();

        System.out.println(d.name);

        d.eat();

        d.bark();


    }
}