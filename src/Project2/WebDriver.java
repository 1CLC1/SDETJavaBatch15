package Project2;

public interface WebDriver {
    /*
    Provide Implementation for the diagram below. Then
    create a test class in which you need to create Objects of
    ChromeDriver, FirefoxDrive and SafariDriver classes and
    see which methods available to them.
    */

    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{

    void navigate();

}

interface TakesScreenShot extends RemoteWebDriver {

    void getScreenShot();

}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigating Chrome Browser");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigating Firefox Browser");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigating Safari Browser");
    }
}