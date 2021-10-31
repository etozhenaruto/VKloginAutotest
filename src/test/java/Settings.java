import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Settings {


    @DataProvider(name= "loginInfo")
    public static Object [][] logIn() {
        return new Object[][] {
                {"ilyagogi@mail.ru","password"},

        };
    }


}
