package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {

    static WebDriver driver=new ChromeDriver();

    @BeforeTest
    public void browserInitiate(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void scrollTest() throws InterruptedException {
        WebElement footerText=driver.findElement(By.id("country"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",footerText);
        Select select=new Select(footerText);
        for (WebElement ele: select.getOptions()){
            System.out.println(ele.getText());
            if (ele.getText().equals("France")){
                ele.click();
                break;
            }
        }
        //select.selectByIndex(3);
        Thread.sleep(2000);

    }
    @AfterTest
    public void browserClose() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
