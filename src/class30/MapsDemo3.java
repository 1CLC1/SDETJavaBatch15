package class30;

import java.util.HashMap;

public class MapsDemo3 {
    public static void main(String[] args) {
     /*
      Create a map of a building. Store floor number and it is associated company name.
      (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map
        */

        HashMap<Integer,String> floor=new HashMap<>();
        floor.put(1,"Google");
        floor.put(2,"Syntax");
        floor.put(3,"Dell");
        floor.put(4,"Microsoft");
        floor.put(5,"Apple");
        floor.put(6,"Samsung");
        floor.put(7,"Wells Fargo");

        System.out.println(floor.size());
        floor.replace(3,"IBM");
        System.out.println(floor);
        floor.remove(7);
        System.out.println(floor);

    }
}
