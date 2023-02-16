package class23.HW;

public class ComputerTester {
    public static void main(String[] args) {

        Computer [] computers={new Apple(), new Lenovo(), new HP(), new Dell()};

        for (Computer c:computers){
            c.storage();
            c.internetBrowser();
            c.videoPlayer();

            if(c instanceof Apple){
                Apple apple=(Apple)c;
                apple.appInstall();
            }
        }
    }
}
