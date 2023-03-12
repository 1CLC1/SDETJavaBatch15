package project2;

public abstract class Marks {
    /*
    We have to calculate the average of marks
    obtained in three subjects by student A and by
    student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning
    the average percentage of marks. Provide
    implementation of abstract method in classes
    'A' and 'B'. The constructor of student A takes the
    marks in three subjects as its parameters and
    the marks in four subjects as its parameters for
    student B. Test your code
    */

    abstract void getPercentage();
}
class A extends Marks{
    double english, math, science;

    A(double english,double math,double science){
        this.english=english;
        this.math=math;
        this.science=science;
    }
    @Override
    void getPercentage() {
        double avgScore=(english+math+science/3);
        System.out.println("Student A's average score is "+avgScore);
    }
}
class B extends Marks{
    double english, math, science,history;
    B(double english,double math,double science,double history){
        this.english=english;
        this.math=math;
        this.science=science;
        this.history=history;
    }
    @Override
    void getPercentage() {
        double avgScore= (english+math+science+history/4);
        System.out.println("Student B's average score is "+avgScore);
    }
}