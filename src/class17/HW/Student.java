package class17.HW;

public class Student {
    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given student using displayInfo method.
    */
    String name;
    String address;

    Student(String sName,String sAddress){
        name=sName;
        address=sAddress;
        }
    void printInfo(){
        System.out.println("Student name: "+name+" Student address: "+address);
    }
}
