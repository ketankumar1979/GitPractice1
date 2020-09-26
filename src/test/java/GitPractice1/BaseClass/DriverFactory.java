package GitPractice1.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public DriverFactory(){

        PageFactory.initElements(driver,this);
}

    public void openbrowser()  {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        //driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
    }

    public void closebrowser(){
        //driver.quit();
    }
}
 ketan_homepage.feature
//test2
=======

//test1
dev
