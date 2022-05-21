package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class SetupTestsPage {
    private WebDriver driver; //оголошення драйвера
    private static final String HOME_URL = "https://www.bbc.com";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();  //встановлення драйвера Chrome
    }


    @BeforeMethod
    public void setUpTest() {
        driver = new ChromeDriver();  // створюється новий об'єкт драйвера
        driver.manage().window().maximize();   // відкривається нове вікно
        driver.get(HOME_URL);        // у вікні запустаємо сторінку HOME_URL
    }

    @AfterMethod
    public void theEndOfMethod() {
        driver.close();
    }

    @AfterTest
    public void theEnd() {
        driver.quit();    // закривається вікно
    }

    public WebDriver getDriver() {
        return driver;
    }
    public SportPage getSportPage() {
        return new SportPage(getDriver());
    }



    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }
    public FootballPage getFootballPage() {
        return new FootballPage(getDriver());
    }
    public ScoresFixturesPage getScoresFixturesPage(){
        return new ScoresFixturesPage(getDriver());
    }
    public GamesByMonthsPage getGamesByMonthsPage(){
        return new GamesByMonthsPage(getDriver());
    }
    public GamesByDatesPage getGamesByDatesPage() {
        return new GamesByDatesPage(getDriver());
    }
    public GamesPage getGamesPage() {
        return new GamesPage(getDriver());
    }
    public ScoreBoard getScoreBoard() {
        return new ScoreBoard(getDriver());
    }

}
