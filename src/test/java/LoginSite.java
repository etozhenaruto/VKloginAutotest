import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginSite {

    WebDriver driver = new ChromeDriver();


    public void getInfo(String login, String password){
        driver.get("https://vk.com");
        driver.findElement(By.id("index_email")).sendKeys(login);
        driver.findElement(By.id("index_pass")).sendKeys(password);
        driver.findElement(By.id("index_login_button")).click();
        driver.quit();

    }


}
