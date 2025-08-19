package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.ClientInfoStatus;
import java.time.Duration;
import java.util.List;

public class FindElementHomeWork {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/login");
    }

    @Test
    public void findElementByTagName() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

    }
    @Test
    public void findElementBySimpleLocators(){
        driver.findElement(By.id("Email"));

        driver.findElement(By.className("email"));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
