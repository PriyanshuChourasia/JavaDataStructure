package JavaTut.AccessModifier;

class Student{
    private String name = "Priyanshu";
    public int age = 14;
    protected String school = "KVS";

    public String getName(){
        return this.name;
    }
}



public class AccessCheck {
    public static void main(String[] args){
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.school);
        System.out.println(student.age);
    }
}
