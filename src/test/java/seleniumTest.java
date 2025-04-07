import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.time.Duration;

public class seleniumTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title=driver.getTitle();
        if (title.equals("DEMOQA")){
            System.out.println("The title is:"+title);
        }
        else{
            System.out.println("The title not correct is:"+title);
        }
        driver.close();
        driver.quit();

    }
}
