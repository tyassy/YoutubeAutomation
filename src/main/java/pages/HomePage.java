package pages;

import base.BasePageObject;
import org.openqa.selenium.By;

import static locators.HomePageLocators.*;

public class HomePage extends BasePageObject{
    public void openPage() {
        openUrl("https://youtube.com/");
        waitShortly();
    }

    public void clickYoutubeContentFilter(String filter) {
        find(By.xpath(String.format(FILTER_BUTTON, filter))).click();
    }

    public void clicMicBtn() {
        find(BUTTON_MICROPHONE).click();
    }

    public Boolean isMicPopupAppear() {
        return find(SEARCH_VOICE_POPUP).isDisplayed();
    }

    public void clickNextFilterBtn(int times) {
        int i;

        for (i = 0; i < times; i++){
            find(BUTTON_RIGHT_ARROW).click();
        }
    }

    public Boolean isFilterContentVisible(String filter) {
        try {
            clickArrowRightBtn();
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

    public void clickSidebarMenu(String sidebarMenu) {
        try {
            waitUntilVisible(BUTTON_SIDEBAR_HOME);
            find(By.xpath(String.format(BUTTON_SIDEBAR_MENU, sidebarMenu))).click();
        }catch (Exception e){
        }
    }

    public Boolean isHistoryPageDisplayed() {
        return find(HISTORY_PAGE).isDisplayed();
    }

    public void click3DotsActionMenu(int contentNo) {
        find(By.xpath(String.format(BUTTON_ACTION_CONTENT,contentNo))).click();
    }

    public void clickActionMenu(String actionMenu) {
        find(By.xpath(String.format(ACTION_MENU_OPTION, actionMenu))).click();
    }

    public Boolean isSharePopupDisplayed() {
        return find(LABEL_SHARE_POPUP).isDisplayed();
    }

    public Boolean isMiniPlayerOpened() {
        return find(CONTAINER_MINI_VIDEO_PLAYER).isDisplayed();
    }

    public Boolean isMiniPlayerPaused() {
        return find(BUTTON_PLAY_ON_MINI_PLAYER).isDisplayed();
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

}
