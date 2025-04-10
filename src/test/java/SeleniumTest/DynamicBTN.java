package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicBTN {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement btn=driver.findElement(By.xpath(".//button[text()='START']"));
        btn.click();
        String color=btn.getCssValue("background-color");
        System.out.println(color);
        if (btn.getAttribute("name").equals("stop")){
            btn.click();
            String newColor=btn.getCssValue("background-color");
            System.out.println(newColor);
        }
        Thread.sleep(4000);
        driver.close();
    }
}
