package JavaTut.chapterOne;


class Student{
    String name;
    int grade;

    void study(){
        System.out.println(this.name +" is studying");
    }
}

public class School {
    public static void main(String[] args){
        Student student = new Student();

        student.name = "Kiran";
        student.grade = 34;
        System.out.println("Name: "+student.name);
        System.out.println("Grade: "+student.grade);
        student.study();
        student.name = "Priyanshu Chourasia";
        student.grade = 45;
        System.out.println("Name: "+student.name);
        System.out.println("Grade: "+student.grade);
        student.study();
        student.name = "Rahul";
        student.grade = 58;
        System.out.println("Name: "+student.name);
        System.out.println("Grade: "+student.grade);
        student.study();
    }
}
