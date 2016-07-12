import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created on 0012, July, 12.
 */
public class InvokeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\apps\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        driver.get("http://techno-geek.co.uk/SeleniumPractice/Form.html");
        driver.get("http://techno-geek.co.uk/callmycab/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[1]/a/nav/span[2]")).click();
        driver.findElement(By.xpath(".//*[@id='development']")).click();
        driver.findElement(By.xpath(".//*[@id='development']")).click();
        System.out.println(driver.findElement(By.xpath(".//*[@id='development']")).isSelected());

//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@test.test");
//        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Testname");
//        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Some address");
//        driver.findElement(By.xpath("//input[@id='hobby']")).sendKeys("Some hobby");

//        driver.quit();
    }
}
