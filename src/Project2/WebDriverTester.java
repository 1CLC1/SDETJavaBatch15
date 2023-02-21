package Project2;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver [] browsers={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};

        for (WebDriver browser:browsers){
            browser.open();
            browser.close();
            browser.getTitle();
        }
    }
}
