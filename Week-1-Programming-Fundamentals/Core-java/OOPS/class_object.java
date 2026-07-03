class Student{
    String name;
    int age;

    void display(){
        System.out.println(name);
        System.out.println(age);
    }

}
 public class class_object{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.display();

        Student s2 = new Student();
        s2.name = "Alice";
        s2.age = 22;
        s2.display();
    }

}