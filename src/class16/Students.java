package class16;

public class Students {
   /*
   Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
    */

    String name;
    String id;
    static int noOfStudents;

    public static void main(String[] args) {
        Students student=new Students();
        student.name="Chris";
        student.id="1";
        student.noOfStudents++;

        Students student1=new Students();
        student1.name="Jim";
        student1.id="2";
        student1.noOfStudents++;
        System.out.println(Students.noOfStudents);

    }
}

