package locators;

import org.openqa.selenium.By;

public interface HomePageLocators {

    //Youtube Filter
    String FILTER_BUTTON = "//yt-chip-cloud-chip-renderer//yt-formatted-string[@title=\"%s\"]";
    By BUTTON_RIGHT_ARROW = By.cssSelector("button[aria-label=\"Next\"]");

    //Sidebar Menu
    String BUTTON_SIDEBAR_MENU = "(//a[@title=\"%s\"])[2]";
    By BUTTON_SIDEBAR_HOME = By.xpath("(//a[@title=\"Home\"])[2]");
    By HISTORY_PAGE = By.cssSelector("//yt-formatted-string[contains(text(),'Keep track of what you watch')]");

    //Youtube Content
    String BUTTON_ACTION_CONTENT = "(//button[@aria-label=\"Action menu\"])[%d]";
    String ACTION_MENU_OPTION = "//tp-yt-paper-item//yt-formatted-string[contains(text(),'%s')]";
    By LABEL_SHARE_POPUP = By.xpath("//yt-share-panel-title-v15-renderer//h2[contains(text(),'Share')]");
    By CONTAINER_MINI_VIDEO_PLAYER = By.xpath("//div[@id=\"container\"]//div[@id=\"movie_player\"]");
    By BUTTON_PLAY_ON_MINI_PLAYER = By.xpath("//div[@class=\"ytp-miniplayer-play-button-container\"]//button[@data-title-no-tooltip=\"Play\"]");

    //Microphone Search
    By SEARCH_VOICE_POPUP = By.cssSelector("//div[contains(text(),'Waiting for permission')]");
    By BUTTON_MICROPHONE = By.cssSelector("button[aria-label=\"Search with your voice\"]");

    //Youtube Channel
    By BUTTON_SUBSCRIBE = By.xpath("//span[contains(text(),'Subscribe')]");
    String BUTTON_CHANNEL_AVATAR = "(//a[@id=\"avatar-link\"])[%d]";

}
