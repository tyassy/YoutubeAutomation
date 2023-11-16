package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;

public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Given("user access youtube homepage")
    public void userAccessYoutubeHomepage() {
        homePage.openPage();
    }

    @When("User click filter {string} on Youtube Homepage")
    public void userClickFilterOnYoutubeHomepage(String filter) {
        homePage.clickYoutubeContentFilter(filter);
    }

    @When("User click arrow right button on filter bar if visible")
    public void userClickArrowRightButtonOnFilterBarTimes() {
        homePage.clickArrowRightBtn();
    }

    @Then("User see {string} filter on Youtube Homepage")
    public void userSeeFilterOnYoutubeHomepage(String filter) {
        Assertions.assertTrue(homePage.isFilterContentVisible(filter));
    }

    @Then("User see user youtube channel is opened")
    public void userSeeUserYoutubeChannelIsOpened() {
        Assertions.assertTrue(homePage.isYoutubeChannelOpened());
    }

    @When("User click avatar from user number {int} from Youtube Homepage")
    public void userClickAvatarFromUserNumberFromYoutubeHomepage(int userNo) {
        homePage.clickUserAvatar(userNo);
    }

    @Then("User see {string} on Youtube Homepage")
    public void userSeeOnYoutubeHomepage(String adDesc) {
        Assertions.assertTrue(homePage.isDescDisplayed(adDesc));
    }

    @When("User click Get it now button on Youtube ad from Youtube Homepage")
    public void userClickGetItNowButtonOnYoutubeAdFromYoutubeHomepage() {
        homePage.clickGetItNowYoutubeAdBtn();
    }

    @Then("User see Youtube ad page is opened")
    public void userSeeYoutubeAdPageIsOpened() {
        Assertions.assertTrue(homePage.isYoutubeAdPageOpened());
    }

    @When("User scroll down Youtube Homepage")
    public void userScrollDownYoutubeHomepage() {
        homePage.scrollDownYoutubeHomepage();
    }

    @Then("User see Trending section is displayed")
    public void userSeeTrendingSectionIsDisplayed() {
        Assertions.assertTrue(homePage.isTrendingSectionDisplayed());
    }
}
