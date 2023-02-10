package class22;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a Degree you need high school diploma");
    }
}
class Bachelors extends Degree {

}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters Degree you need a Bachelors Degree");
    }
}

class DegreeTester {

    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}