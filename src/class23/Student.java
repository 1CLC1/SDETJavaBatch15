package class23;

public class Student {

    public void study(){
        System.out.println("Studying....");
    }
    public void doHomework(){
        System.out.println("Solving homeworks");
    }
    public void practice(){
        System.out.println("Practicing the skills");
    }
}
class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Syntax Student must study Programming");
    }

    @Override
    public void doHomework() {
        System.out.println("Syntax Students must solve the homeworks before next class");
    }

    @Override
    public void practice() {
        System.out.println("Syntax Student must practice Repls");
    }
}
class CollegeStudent extends Student{
    @Override
    public void practice() {
        System.out.println("College students must practice to get good grades");
    }
}
class SchoolStudent extends Student{

}