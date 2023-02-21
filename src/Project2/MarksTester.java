package Project2;

public class MarksTester {
    public static void main(String[] args) {

        Marks [] marks={new A(87,75,80),new B(95,100,92,88)};
        for (Marks m:marks){
            m.getPercentage();
        }
    }
}
