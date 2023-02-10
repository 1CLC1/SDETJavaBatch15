package class21;

public class Programming {

    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        new Programming("Java");
        Programming programming=new Programming();

    }
}
