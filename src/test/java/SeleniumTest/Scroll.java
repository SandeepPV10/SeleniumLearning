package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Scroll {

    static WebDriver driver=new ChromeDriver();

    @BeforeTest
    public void browserInitiate(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void scrollTest(){
       WebElement footerText=driver.findElement(By.xpath(".//h2[text()='Footer Links']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", footerText);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> footerLinks=driver.findElements(By.xpath(".//h2[text()='Footer Links']/following-sibling::div[@class='widget-content']/ul/li/a"));
        for (WebElement ele1: footerLinks){
            wait.until(ExpectedConditions.refreshed(
                    ExpectedConditions.visibilityOfAllElements(footerLinks)
            ));
            if (ele1.getText().equals("Home")){
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
