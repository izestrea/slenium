import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created on 0012, July, 12.
 */
public class InvokeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\apps\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();
        driver.quit();
    }
}
