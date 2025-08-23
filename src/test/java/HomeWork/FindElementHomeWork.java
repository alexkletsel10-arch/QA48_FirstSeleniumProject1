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
        driver.get("https://demowebshop.tricentis.com/register");

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
    public void findElementBySimpleLocators() {
        driver.findElement(By.id("Email"));

        driver.findElement(By.className("email"));
    }

    @Test
    public void findElementByCssLocatorsOnRegisterPage(){
        //tag==css
        driver.findElement(By.cssSelector("h1"));
        // by class name css(.)
        driver.findElement(By.cssSelector(".master-wrapper-main"));
        // by id css(#)
        driver.findElement(By.cssSelector("#FirstName"));
        // by [attr = 'value']
        driver.findElement(By.cssSelector("[name='Password']"));
        //contains->*
        driver.findElement(By.cssSelector("[name*='Confirm']"));
        //start->^
        driver.findElement(By.cssSelector("[id^='re']"));
        //end on->$
        driver.findElement(By.cssSelector("[value$='ster']"));
        //tag + id
        driver.findElement(By.cssSelector("input#register-button"));
        //tag+class
        driver.findElement(By.cssSelector("div.gender"));
        

    }
    @Test
    public void findElementXpathOnRegisterPage(){
       //tag->xpath - // tag
        driver.findElement(By.xpath("//h1"));

        // id ->xpath //*[@id = 'value']
        driver.findElement(By.xpath("//input[@id='FirstName']"));

        //contains->//*[contains(.,'Text')]
        driver.findElement(By.xpath("//label[contains(.,'Last')]"));

        // equal -> //*[text()='Text']
        driver.findElement(By.xpath("//strong[text()='Your Personal Details']"));
        driver.findElement(By.xpath("//strong[.='Your Personal Details']"));

        //start ->//*[starts-with(@attr,'Text')]
        driver.findElement(By.xpath("//input[starts-with(@id,'F')]"));

        //move up
        driver.findElement(By.xpath("//div[@class='form-fields']/.."));

        //parent
        driver.findElement(By.xpath("//strong/parent::*"));
        driver.findElement(By.xpath("//strong/parent::div"));
        driver.findElement(By.xpath("//strong/parent::div[1]"));

        // ancestors
        driver.findElement(By.xpath("//label/ancestor::*"));
        driver.findElement(By.xpath("//label/ancestor::div"));

        //following-siblings
        driver.findElement(By.xpath("//label/following-sibling::input"));

        //preceding-sibling
        driver.findElement(By.xpath("//input/preceding-sibling::label"));


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
