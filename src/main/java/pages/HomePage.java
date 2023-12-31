package pages;

import base.BasePageObject;
import org.openqa.selenium.By;

import static locators.HomePageLocators.*;

public class HomePage extends BasePageObject{
    public void openPage() {
        openUrl("https://youtube.com/");
        waitUntilFullyLoad();
    }

    public void clickYoutubeContentFilter(String filter) {
        find(By.xpath(String.format(FILTER_BUTTON, filter))).click();
    }

    public Boolean isFilterContentVisible(String filter) {
        try {
            return find(By.xpath(String.format(FILTER_BUTTON, filter))).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public Boolean isArrowRightClickable() {
        try {
            return find(BUTTON_RIGHT_ARROW).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public void clickArrowRightBtn() {
        while (isArrowRightClickable()){
            find(BUTTON_RIGHT_ARROW).click();
        }
    }

    public void clickUserAvatar(int userNo ) {
        find(By.xpath(String.format(BUTTON_CHANNEL_AVATAR, userNo))).click();
    }

    public Boolean isYoutubeChannelOpened() {
        try {
            waitUntilVisible(BUTTON_SUBSCRIBE);
            return find(BUTTON_SUBSCRIBE).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickGetItNowYoutubeAdBtn() {
        waitUntilVisible(BUTTON_GET_IT_NOW_AD);
        find(BUTTON_GET_IT_NOW_AD).click();
    }

    public Boolean isYoutubeAdPageOpened() {
        try {
            waitUntilVisible(YOUTUBE_MUSIC_PREMIUM_TRY_BUTTON);
            return find(YOUTUBE_MUSIC_PREMIUM_TRY_BUTTON).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void scrollDownYoutubeHomepage() {
        scrollToElement(TRENDING_TITLE_SECTION);
    }

    public Boolean isTrendingSectionDisplayed() {
        try {
            waitUntilVisible(TRENDING_TITLE_SECTION);
            return find(TRENDING_TITLE_SECTION).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void typeKeywordOnSearchBar(String keyword) {
        waitUntilVisible(INPUT_SEARCH_KEYWORD);
        find(INPUT_SEARCH_KEYWORD).click();
        find(INPUT_SEARCH_KEYWORD).clear();
        type(INPUT_SEARCH_KEYWORD, keyword);
    }

    public void clickSearchBtn() {
        find(SEARCH_BUTTON).click();
    }

    public Boolean isSearchResultDisplayed(String keyword) {

        try{
            waitUntilAllVisible(LABEL_VIDEO_TITLE);
            return find(By.xpath(String.format(CONTENTS_TITLE, keyword))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
