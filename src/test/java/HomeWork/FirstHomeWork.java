package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstHomeWork {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
         driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         driver.navigate().to("https://demowebshop.tricentis.com");

         driver.navigate().to("https://www.google.com");

         driver.navigate().back();
         driver.navigate().forward();
         driver.navigate().refresh();
    }

    @Test
    public void openDemoWebShop(){
        System.out.println("demowebshop opened");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

