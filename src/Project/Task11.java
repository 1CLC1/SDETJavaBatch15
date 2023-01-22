package Project;

public class Task11 {
    public static void main(String[] args) {

        /*11)Write a program to print out duplicate elements from an Array of Strings?*/

        String [] carBrands = {"Chevrolet","Dodge","Toyota","Chevrolet","Mercedes Benz","Chevrolet","Ford"};

        for (String carBrand : carBrands) {
            if (carBrand.equals("Chevrolet")) {
                System.out.println(carBrand);
            }
        }

    }
}
