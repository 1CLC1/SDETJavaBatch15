package class21;

public class Task2 {
    static void method(String str1) {
        System.out.println("Method with one String");
    }

    static void method(String str1, String str2) {
        System.out.println("Method with two Strings");
    }

    static void method(String str1, String str2, String str3) {
        System.out.println("Method with three Strings");
    }

    public static void main(String[] args) {
        method("Java");
        method("Python","Java");
        method("Python","Java","C++");
    }
}
