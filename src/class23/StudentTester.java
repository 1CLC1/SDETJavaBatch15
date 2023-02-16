package class23;

public class StudentTester {

    public static void main(String[] args) {
        Student [] students={new CollegeStudent(), new SyntaxStudent(), new SchoolStudent()};

        for (Student student:students){
            student.doHomework();
            student.practice();
            student.study();
        }
    }
}

