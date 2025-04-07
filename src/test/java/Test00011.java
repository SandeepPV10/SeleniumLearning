import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class Test00011 {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true)");
        table("SmartPhone");

    }

    public static String table(String name) {
        List<WebElement> tabledata = driver.findElements(By.xpath(".//table[@id='productTable']//tr//td"));
        String price="";
        for (WebElement ele : tabledata) {
            if (name.equals(ele.getText())) {
                price=tabledata.get(2).getText();
                System.out.println(price);
            }
        }
        return price;
    }

}