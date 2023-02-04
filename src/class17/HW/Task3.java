package class17.HW;

public class Task3 {
     /*Write a java class that have 4 constructors with 4 different access levels of constructors (private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
     and observe result.*/

    String name;
    int ssn;
    String state;
    String phoneNumber;

    private Task3(String name1,int ssn1,String state1,String number){
        name=name1;
        ssn=ssn1;
        state=state1;
        phoneNumber=number;

    }
    Task3(String name1,String number,String state1) {
        name = name1;
        state = state1;
        phoneNumber = number;
    }
    protected Task3(String name1,int ssn1,String number) {
        name = name1;
        ssn = ssn1;
        phoneNumber = number;
    }
    public Task3(int ssn1, String state1, String number, String name1) {
        ssn = ssn1;
        state = state1;
        phoneNumber = number;
        name=name1;
    }

    public void print(){
        System.out.println(name+ssn+state+phoneNumber);
    }

    public static void main(String[] args) {
        Task3 task=new Task3("Jerry ",6942561," NY"," (507)634-2744");
        task.print();
    }
}
