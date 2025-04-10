package SeleniumTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertsInteraction {
    static WebDriver driver=new ChromeDriver();
    @BeforeTest
    public void browserInitiate(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void alert1() throws InterruptedException {
    WebElement alert1=driver.findElement(By.id("alertBtn"));
    alert1.click();
    driver.switchTo().alert().accept();
    Thread.sleep(2000);

    }
    @Test
    public void alert2() throws InterruptedException {
        System.out.println("Test 2");
        WebElement alert2=driver.findElement(By.id("confirmBtn"));
        alert2.click();
        driver.switchTo().alert().dismiss();
        WebElement alertAction=driver.findElement(By.id("demo"));
        String message1=alertAction.getText();
        System.out.println(message1);
        Assert.assertEquals(message1,"You pressed Cancel!");
        Thread.sleep(2000);
        alert2.click();
        driver.switchTo().alert().accept();
        String message2=alertAction.getText();
        System.out.println(message2);
        Assert.assertEquals(message2,"You pressed OK!");

    }
    @Test
    public void alert3() throws InterruptedException {
        System.out.println("Test 3");
        WebElement alert3=driver.findElement(By.id("promptBtn"));
        alert3.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("sandeep");
        alert.accept();
        Thread.sleep(2000);
        WebElement alertAction=driver.findElement(By.id("demo"));
        String message1=alertAction.getText();
        System.out.println(message1);
        Assert.assertEquals(message1,"Hello sandeep! How are you today?");
        alert3.click();
        //alert3.sendKeys("sandeep");
        alert.dismiss();
        String message2=alertAction.getText();
        System.out.println(message2);
        Assert.assertEquals(message2,"User cancelled the prompt.");
        alert3.click();
        //alert3.sendKeys("sandeep");
        alert.accept();
        String message3=alertAction.getText();
        System.out.println(message3);
        //Assert.assertEquals(message3,"Hello sandeep! How are you today?");



    }
    @AfterTest
    public void browserClose() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
