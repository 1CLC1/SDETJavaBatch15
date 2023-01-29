package class16;

public class StudentTester {
    public static void main(String[] args) {

        Student student=new Student();
        student.name="Chris";
        student.id="123";
        student.age=22;
        student.weight=70;
        student.schoolName="Syntax";

        Student student1=new Student();
        student1.name="Stanley";
        student1.id="456";
        student1.age=5;
        student1.weight=50;
        // student1.schoolName="Syntax";

        Student student2=new Student();
        // student2.name="Danny";
        student2.id="789";
        student2.age=26;
        student2.weight=80;
        // student2.schoolName="Syntax";

        System.out.println(student2.schoolName);
        System.out.println(Student.schoolName); // another way that you might see a lot to access
        System.out.println(student2.name);


    }
}
