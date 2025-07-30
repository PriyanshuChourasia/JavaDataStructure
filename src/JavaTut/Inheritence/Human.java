package JavaTut.Inheritence;

class Person{
    void walk(){
        System.out.println("Person is walking....");
    }
}

class Student extends Person{
    void study(){
        System.out.println("Student study");
    }
}

class Teacher extends Person{
    void teach(){
        System.out.println("Teachers teach");
    }
}



public class Human {
    public static void main(String[] args){
        Student student = new Student();
        student.study();
        student.walk();
        Teacher teacher = new Teacher();
        teacher.teach();
        teacher.walk();
    }
}
