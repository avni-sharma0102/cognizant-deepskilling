class Student{
    String name;
    int age;
    Student (String n,int a){
        name=n;
        age=a;
    }

void display(){
        System.out.println(name);
        System.out.println(age);
    }
}


public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("avni",21);
        s1.display();

    }
}