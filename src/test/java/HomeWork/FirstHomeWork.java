package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstHomeWork {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
         driver = new ChromeDriver();
         driver.get("https://demowebshop.tricentis.com/");

    }

    @Test
    public void openDemoWebShop(){
        System.out.println("demowebshop opened");
    }
}

