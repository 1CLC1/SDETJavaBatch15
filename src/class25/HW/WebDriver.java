package class25.HW;

public interface WebDriver {
   /*
   Create a WebDriver Interface that will have the following unimplemented behaviour:
   openBrowser(), closeBrowser(), maximizeWindow(), findElement().
   Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window on Chrome browser");
    }
    @Override
    public void findElement() {
        System.out.println("Finding element on Chrome browser");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window in FireFox browser");
    }
    @Override
    public void findElement() {
        System.out.println("Finding element on FireFox browser");
    }

    public static void main(String[] args) {

        WebDriver [] webDrivers={new ChromeDriver(), new FireFoxDriver()};

        for (WebDriver web:webDrivers){
            web.openBrowser();
            web.closeBrowser();
            web.maximizeWindow();
            web.findElement();
        }
    }
}