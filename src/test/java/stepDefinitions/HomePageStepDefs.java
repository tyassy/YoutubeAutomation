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

    @When("User click arrow right button on filter bar {int} times")
    public void userClickArrowRightButtonOnFilterBarTimes(int times) {
        homePage.clickNextFilterBtn(times);
    }

    @Then("User see {string} filter on Youtube Homepage")
    public void userSeeFilterOnYoutubeHomepage(String filter) {
        Assertions.assertTrue(homePage.isFilterContentVisible(filter));
    }

    @When("User click {string} button on Youtube Homepage sidebar")
    public void userClickButtonOnYoutubeHomepageSidebar(String sidebarMenu) {
        homePage.clickSidebarMenu(sidebarMenu);
    }

    @Then("User see watch history page is opened")
    public void userSeeWatchHistoryPageIsOpened() {
        Assertions.assertTrue(homePage.isHistoryPageDisplayed());
    }

    @When("User click microphone button on Youtube Homepage")
    public void userClickMicrophoneButtonOnYoutubeHomepage() {
        homePage.clicMicBtn();
    }

    @Then("User see waiting for permission popup is shown")
    public void userSeeWaitingForPermissionPopupIsShown() {
        Assertions.assertTrue(homePage.isMicPopupAppear());
    }

    @When("User click action button on content number {int}")
    public void userClickActionButtonOnContentNo(int contentNo) {
        homePage.click3DotsActionMenu(contentNo);
    }

    @And("User click {string} button on content action menu")
    public void userClickButtonOnContentMenu(String actionMenu) {
        homePage.clickActionMenu(actionMenu);
    }

    @Then("User see share popup is displayed")
    public void userSeeSharePopupIsDisplayed() {
        Assertions.assertTrue(homePage.isSharePopupDisplayed());
    }

    @Then("User see mini player is opened with content paused")
    public void userSeeMiniPlayerIsOpenedWithContentPaused() {
        Assertions.assertTrue(homePage.isMiniPlayerOpened());
        Assertions.assertTrue(homePage.isMiniPlayerPaused());
    }

    @Then("User see user youtube channel is opened")
    public void userSeeUserYoutubeChannelIsOpened() {
        Assertions.assertTrue(homePage.isYoutubeChannelOpened());
    }

    @When("User click avatar from user number {int} from Youtube Homepage")
    public void userClickAvatarFromUserNumberFromYoutubeHomepage(int userNo) {
        homePage.clickUserAvatar(userNo);
    }
}
