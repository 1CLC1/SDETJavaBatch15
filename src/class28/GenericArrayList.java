package class28;

import class26.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        // ArrayList<String> name=new ArrayList<>();
        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

        // No one uses arrays like this
        ArrayList name=new ArrayList();
        name.add("Tom");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","Green","Unknown"));

        for (Object j:name){
            ((String)j).trim();
        }


    }
}
