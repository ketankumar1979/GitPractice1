package GitPractice1.PageObject;

import GitPractice1.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {
    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_1gqeQ")
    WebElement magnifierGlass;

    public void dosearch(String item){
        SearchTextBox.sendKeys(item);
        magnifierGlass.click();
    }

    public void getHomePageUrl(){
        String actual = driver.getCurrentUrl();
        Assert.assertThat(actual, Matchers.containsString("https://www.argos.co.uk/"));
    }

    public void getResultPageURL(){
        String actualNikeResult = driver.getCurrentUrl();
        Assert.assertThat(actualNikeResult, Matchers.containsString("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike"));

    }
}
