package class28;

import java.util.ArrayList;

public class ArrayVsLinkedList {
    public static void main(String[] args) {

        // Linkedlist => 78 ms
        // ArrayList => 48079
        long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(0,"Test Data");
        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
