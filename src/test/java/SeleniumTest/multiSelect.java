package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class multiSelect {
    static WebDriver driver=new ChromeDriver();

    @BeforeTest
    public void browserInitiate(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void multieSelect(){
        //List<WebElement> checkbox=driver.findElements(By.xpath(".//div[@class='form-check form-check-inline']/input[@type='checkbox']"));
        //for (WebElement ele: checkbox){
            List<WebElement> days=driver.findElements(By.xpath(".//div[@class='form-check form-check-inline']/input[@type='checkbox']/following-sibling::label"));
            for (WebElement ele1: days){
                if (ele1.getText().equals("Monday") || ele1.getText().equals("Sunday")){
                    System.out.println(ele1.getText());
                    ele1.click();
                }
            }
        }
    @AfterTest
    public void browserClose() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
