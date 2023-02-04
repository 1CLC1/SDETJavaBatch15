package class17;

public class Student {
    String id;
    String name;
    int age;
    double weight;

    public Student(String sName,String sId,int sAge){
        id=sId;
        name=sName;
        age=sAge;
    }
    public Student(String sName,int sAge,String sId){
        id=sId;
        name=sName;
        age=sAge;
    }
    public Student(String sName,String sId,int sAge,double sWeight){
        id=sId;
        name=sName;
        age=sAge;
        weight=sWeight;
    }
    void printInfo(){
        if(weight==0){
            System.out.println(name+" "+id+" "+age+" "+weight);
        }else{
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Student student1=new Student("Chris","123",22,68);
        student1.printInfo();
    }
}
