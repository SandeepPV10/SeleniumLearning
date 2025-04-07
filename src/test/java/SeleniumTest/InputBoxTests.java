package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InputBoxTests {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement nameField=driver.findElement(By.id("name"));
        WebElement emailField=driver.findElement(By.id("email"));
        WebElement phoneField=driver.findElement(By.id("phone"));
        WebElement textAreaField=driver.findElement(By.id("textarea"));
        nameField.clear();
        nameField.sendKeys("Sandeep");
        SoftAssert softAssert=new SoftAssert();
        System.out.println(nameField.getText());
        softAssert.assertEquals(nameField.getText(),"Sandeep");
        emailField.clear();
        emailField.sendKeys("Sandeep@gmail.com");
        phoneField.clear();
        phoneField.sendKeys("8553014713");
        textAreaField.clear();
        textAreaField.sendKeys("textarea field entered");
//search field test
        List<WebElement> searchFieldAndSearch=driver.findElements(By.xpath("//*[@class='wikipedia-searchtable']/child::span/following-sibling::span/span/input"));
        searchFieldAndSearch.getFirst().sendKeys("Sandeep");
        searchFieldAndSearch.getLast().click();
List<WebElement> searchDisplayed=driver.findElements(By.xpath(".//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
        List<String> listresults= new ArrayList<>();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(searchDisplayed));
for (WebElement ele: searchDisplayed){
            listresults.add(ele.getText());
        }
Thread.sleep(2000);

        System.out.println(listresults);
if (listresults.contains("Sandeep")){
    System.out.println("pass");
}
else {
    System.out.println("Fail");
}
Thread.sleep(1000);
        driver.close();
    }
}
