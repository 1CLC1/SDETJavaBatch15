package class23;

public class WebDriverTester {
    public static void main(String[] args) {
        /*WebDriver webDriver=new FireFox(); //Up casting
        // FireFox fireFox=new WebDriver(); down casting
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();*/

        // an Array of type parent class can hold the objects of all the child classes
        WebDriver [] browsers={new Chrome(), new Safari(), new FireFox()};

        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }
    }
}
