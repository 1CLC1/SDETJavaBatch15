package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name="Nima";
        String[] names={"Hiral","Nima","Laura","Nat"};
        System.out.println(contains(name,names));
    }

    public static boolean contains(String nameToBeSearched,String[] names){
        for (String name:names){
            if (nameToBeSearched.equals(name)){
                return true;
            }
        }
        return false;
    }
}
