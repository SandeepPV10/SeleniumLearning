package SeleniumTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class CalendarTest1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement cal1=driver.findElement(By.id("datepicker"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",cal1);
        cal1.sendKeys("05/03/2025");
        Actions actions=new Actions(driver);
        actions.moveToElement(cal1);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        WebElement cal2=driver.findElement(By.id("txtDate"));
        cal2.click();
        driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).sendKeys("May");
// Select Year
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).sendKeys("2025");
        driver.findElement(By.xpath("//a[text()='15']")).click();
    }
}
