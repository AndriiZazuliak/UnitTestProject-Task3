package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ThirdTask extends SetupTestsPage{
    private static final long WAIT_TIME = 20;

    @Test
    public void checkFirstPare() {
        getHomePage().clickSportTab();
        getSportPage().clickFootballTab();
        getFootballPage().clickScoresFixturesTab();
        getScoresFixturesPage().enterTextToSearchField("Scottish Championship");
        getScoresFixturesPage().waitForPageLoadComplete(WAIT_TIME);
        getScoresFixturesPage().clickSearchScottishChampionship();
        getScoresFixturesPage().waitForPageLoadComplete(WAIT_TIME);
        getGamesByMonthsPage().selectApril();
        getGamesByDatesPage().waitForClickable(WAIT_TIME, getGamesByDatesPage().getOn29AprilPlay());
        getGamesByDatesPage().selectOn29AprilPlay();
        getGamesPage().waitForPageLoadComplete(WAIT_TIME);
        String title1 = getGamesPage().getCommand1Title();
        System.out.println(" 1 " + title1);
        assertEquals(title1, "Arbroath");
        String title2 = getGamesPage().getCommand2Title();
        System.out.println(" 2 " + title2);
        assertEquals(title2, "Greenock Morton");
        String score1 = getGamesPage().getCommand1Score();
        String score2 = getGamesPage().getCommand2Score();
        String score = score1 + " : " + score2;
        assertEquals(score, "3 : 0");
    }
    @Test
    public void checkSecondPare() {
        getHomePage().clickSportTab();
        getSportPage().clickFootballTab();
        getFootballPage().clickScoresFixturesTab();
        getScoresFixturesPage().enterTextToSearchField("Scottish Championship");
        getScoresFixturesPage().waitForPageLoadComplete(WAIT_TIME);
        getScoresFixturesPage().clickSearchScottishChampionship();
        getScoresFixturesPage().waitForPageLoadComplete(WAIT_TIME);
        getGamesByMonthsPage().selectApril();
        getGamesByDatesPage().waitForClickable(WAIT_TIME, getGamesByDatesPage().getOn16AprilPlay());
        getGamesByDatesPage().selectOn16AprilPlay();

        getGamesPage().waitForPageLoadComplete(WAIT_TIME);
        String title1 = getGamesPage().getCommand1Title();
        System.out.println(" 1 " + title1);
        String title2 = getGamesPage().getCommand2Title();
        System.out.println(" 2 " + title2);
        String score1 = getGamesPage().getCommand1Score();
        String score2 = getGamesPage().getCommand2Score();
        String score = score1 + " : " + score2;
        System.out.println(score);

        assertEquals(title1, "Partick Thistle");
        assertEquals(title2, "Raith Rovers");
        assertEquals(score, "0 : 1");
    }
    @Test
    public void checkThirdPare() {
        getHomePage().clickSportTab();
        getSportPage().clickFootballTab();
        getFootballPage().clickScoresFixturesTab();
        getScoresFixturesPage().enterTextToSearchField("Scottish Championship");
        getScoresFixturesPage().waitForPageLoadComplete(WAIT_TIME);
        getScoresFixturesPage().clickSearchScottishChampionship();
        getScoresFixturesPage().waitForPageLoadComplete(WAIT_TIME);
        getGamesByMonthsPage().selectNovember();
        getGamesByDatesPage().waitForClickable(WAIT_TIME, getGamesByDatesPage().getOn13NovemberPlay());
        getGamesByDatesPage().selectOn13NovemberPlay();
        getGamesPage().waitForPageLoadComplete(WAIT_TIME);
        String title1 = getGamesPage().getCommand1Title();
        System.out.println(" 1 " + title1);
        assertEquals(title1, "Inverness Caledonian Thistle");
        String title2 = getGamesPage().getCommand2Title();
        System.out.println(" 2 " + title2);
        assertEquals(title2, "Dunfermline");
        String score1 = getGamesPage().getCommand1Score();
        String score2 = getGamesPage().getCommand2Score();
        String score = score1 + " : " + score2;
        assertEquals(score, "1 : 2");
    }
    @Test
    public void checkFourthPare() {
        getHomePage().clickSportTab();
        getSportPage().clickFootballTab();
        getFootballPage().clickScoresFixturesTab();
        getScoresFixturesPage().enterTextToSearchField("Bayern Munich");
        getScoresFixturesPage().waitForPageLoadComplete(WAIT_TIME);
        getScoresFixturesPage().clickSearchBayernMunich();
        getScoresFixturesPage().waitForPageLoadComplete(WAIT_TIME);
        getGamesByMonthsPage().selectMarch();
        getGamesByDatesPage().waitForClickable(WAIT_TIME, getGamesByDatesPage().getOn8MarchPlay());
        getGamesByDatesPage().selectOn8MarchPlay();
        getGamesPage().waitForPageLoadComplete(WAIT_TIME);
        String title1 = getGamesPage().getCommand1Title();
        System.out.println(" 1 " + title1);
        assertEquals(title1, "Bayern Munich");
        String title2 = getGamesPage().getCommand2Title();
        System.out.println(" 2 " + title2);
        assertEquals(title2, "FC Red Bull Salzburg");
        String score1 = getGamesPage().getCommand1Score();
        String score2 = getGamesPage().getCommand2Score();
        String score = score1 + " : " + score2;
        assertEquals(score, "7 : 1");
    }

    @Test
    public void checkScore(){
        String score1 = getScoreBoard().getScore("Bayern Munich", "FC Red Bull Salzburg");
        System.out.println(score1);
        String score2 = getScoreBoard().getScore("Manchester United", "Liverpool");
        System.out.println(score2);
        String score3 = getScoreBoard().getScore("Barcelona", "Sevilla");
        System.out.println(score3);
    }

}
