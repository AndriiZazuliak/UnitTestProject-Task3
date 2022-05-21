package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamesByMonthsPage extends BasePage{
    @FindBy(xpath = "//ul/li/a[contains(@href, '2022-04')]")
    private WebElement april;
    @FindBy(xpath = "//ul/li/a[contains(@href, '2021-11')]")
    private WebElement november;
    @FindBy(xpath = "//ul/li/a[contains(@href, '2022-03')]")
    private WebElement march;

    public GamesByMonthsPage(WebDriver driver){
        super(driver);
    }
    public void selectApril(){
        april.click();
    }
    public void selectNovember(){
        november.click();
    }
    public void selectMarch(){
        march.click();
    }

}
