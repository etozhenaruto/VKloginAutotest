import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;



public class FirstTest  extends  Settings{
    WebDriver driver = new ChromeDriver();

    @Test(dataProvider = "loginInfo")
    public void openSite (String log, String pass){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            Thread.sleep(1000);
            LoginSite ls = new LoginSite();
            ls.getInfo(log,pass);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }
    }
}
