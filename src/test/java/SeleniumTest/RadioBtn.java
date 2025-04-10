package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class RadioBtn {
   static WebDriver driver=new ChromeDriver();
    @Test
    public void radioBtn() throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       List <WebElement> radio=driver.findElements(By.name("gender"));
       for (WebElement gender:radio){
if (gender.getAttribute("value").equals("female")){
gender.click();
}
       }
       Thread.sleep(2000);
}
@AfterTest
    public void browserClose(){
        driver.close();
}
}
