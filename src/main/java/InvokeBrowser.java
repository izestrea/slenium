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
        driver.get("http://techno-geek.co.uk/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}
