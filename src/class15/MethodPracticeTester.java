package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {
        MethodPractice mp=new MethodPractice();
        boolean isEven= mp.isEven(15);
        System.out.println(isEven);
        boolean isEven1=mp.isEven(100);
        System.out.println(isEven1);
        System.out.println(mp.isEven(12));
        System.out.println(mp.isEven(20));
    }
}
