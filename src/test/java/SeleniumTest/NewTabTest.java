package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class NewTabTest {

    static WebDriver driver=new ChromeDriver();

    @BeforeTest
    public void browserInitiate(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void newTabTest() throws InterruptedException {
        WebElement tab=driver.findElement(By.xpath(".//button[text()='New Tab']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",tab);
        String mainWindow=driver.getWindowHandle();
        tab.click();
        Set<String> windows=driver.getWindowHandles();
        for (String window: windows){
            if (!window.equals(mainWindow)){
                driver.switchTo().window(window);
                String title= driver.getTitle();
                System.out.println(title);
             driver.close();
             Thread.sleep(2000);
             driver.switchTo().window(mainWindow);
                String title1= driver.getTitle();
                System.out.println(title1);

            }
        }
        Thread.sleep(2000);

    }
    @AfterTest
    public void browserClose() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
