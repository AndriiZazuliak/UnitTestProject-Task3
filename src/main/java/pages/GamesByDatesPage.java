package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamesByDatesPage extends BasePage{

    @FindBy(xpath = "//a[@href='/sport/football/61185126']")
    private WebElement on29AprilPlay;
    @FindBy(xpath = "//a[@href='/sport/football/60903648']")
    private WebElement on16AprilPlay;
    @FindBy(xpath = "//a[@href='/sport/football/59187626']")
    private WebElement on13NovemberPlay;
    @FindBy(xpath = "//a[@href='/sport/football/60667847']")
    private WebElement on8MarchPlay;


    public GamesByDatesPage(WebDriver driver){
        super(driver);
    }

    public void selectOn29AprilPlay(){
        on29AprilPlay.click();
    }
    public WebElement getOn29AprilPlay(){
        return on29AprilPlay;
    }

    public void selectOn16AprilPlay(){
        on16AprilPlay.click();
    }
    public WebElement getOn16AprilPlay() {
        return on16AprilPlay;
    }

    public void selectOn13NovemberPlay(){
        on13NovemberPlay.click();
    }
    public WebElement getOn13NovemberPlay() {
        return on13NovemberPlay;
    }

    public void selectOn8MarchPlay(){
        on8MarchPlay.click();
    }
    public WebElement getOn8MarchPlay() {
        return on8MarchPlay;
    }
}
