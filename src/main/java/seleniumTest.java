import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
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
