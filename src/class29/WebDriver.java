package class29;

public interface WebDriver {
}

interface Screenshot{

    void method1();
}

interface RemoteWebDriver extends Screenshot, WebDriver {

}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void method1() {

    }
}