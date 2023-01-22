package class11.Homework;

public class Task1 {
    public static void main(String[] args) {

                String [][] namesAndGrades={{"Chris","Dan","John","Jim"},
                        {"A","B","C","D"},
                };
        for (String[] namesAndGrade : namesAndGrades) {
            for (int j = 0; j < namesAndGrade.length; j++) {
                if (namesAndGrade[j].equals("A") || namesAndGrade[j].equals("B")) {
                    System.out.println(namesAndGrades[0][j] + " Has either an A or B grade ");
                }
            }
            System.out.println();
        }
            }
        }
