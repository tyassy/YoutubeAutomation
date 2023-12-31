package locators;

import org.openqa.selenium.By;

public interface HomePageLocators {

    //Youtube Filter
    String FILTER_BUTTON = "//yt-chip-cloud-chip-renderer//yt-formatted-string[@title=\"%s\"]";
    By BUTTON_RIGHT_ARROW = By.cssSelector("button[aria-label=\"Next\"]");
    By BUTTON_GET_IT_NOW_AD = By.xpath("//ytd-button-renderer[@id=\"action-button\"]");

    //Youtube Ad
    String LABEL_YOUTUBE_AD_DESC = "//yt-formatted-string[@id=\"text\"][text()=\"%s\"]";
    By YOUTUBE_MUSIC_PREMIUM_TRY_BUTTON = By.xpath("//button[@aria-label='Try it free']");
    By YOUTUBE_AD_DESC = By.xpath("(//div[@id=\"container\"]/yt-formatted-string[@id=\"text\"])[2]");

    //Youtube Channel
    By BUTTON_SUBSCRIBE = By.xpath("//span[contains(text(),'Subscribe')]");
    String BUTTON_CHANNEL_AVATAR = "(//a[@id=\"avatar-link\"])[%d]";

    //Youtube Content
    By ALL_CONTENTS_SECTION = By.xpath("(//div[@id=\"contents\"])[1]");
    By TRENDING_TITLE_SECTION = By.xpath("//div[@id=\"content\"]//span[(text()=\"Trending\")]");

    //Youtube Search
    By INPUT_SEARCH_KEYWORD = By.cssSelector("input[id=\"search\"]");
    By SEARCH_BUTTON = By.cssSelector("button[id=\"search-icon-legacy\"]");
    String CONTENTS_TITLE = "//yt-formatted-string[contains(text(),'%s')]";
    By LABEL_VIDEO_TITLE = By.cssSelector("a[id=\"video-title\"]");

}
