package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        // a 2D array which can hold 3 one D arrays
        // each of size 3
        String[][] ThomasTheTrain=new String [3][3];
        String[] cabin0={"Chris","Adam","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","Zahra"};

        ThomasTheTrain[0]=cabin0;
        ThomasTheTrain[1]=cabin1;
        ThomasTheTrain[2]=cabin2;

        // in the first [] we specify the address of 1D ARRAY
        System.out.println(ThomasTheTrain[1][1]);
        System.out.println(Arrays.toString(ThomasTheTrain[0]));
    }
}
