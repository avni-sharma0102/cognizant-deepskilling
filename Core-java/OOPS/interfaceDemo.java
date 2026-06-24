interface Animal{
    void sound();

}
class  Dog implements Animal{
     @Override
     public void sound(){
        System.out.println("barks");
    }
}
public class interfaceDemo{
    public static void main(String[] args){
        Animal d=new Dog();
        d.sound();
       
    }
}