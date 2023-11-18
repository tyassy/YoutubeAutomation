@YoutubeHome
Feature: YoutubeHome

  Background:
    Given User access youtube homepage

  @case1
  Scenario: Verify User can open Youtube Channel from Youtube Content on Youtube Homepage
    When User click avatar from user number 1 from Youtube Homepage
    Then User see user youtube channel is opened

  @case2
  Scenario: Verify User can see Recently Uploaded filter on Youtube Homepage
    When User click arrow right button on filter bar if visible
    Then User see "Recently uploaded" filter on Youtube Homepage

  @case3
  Scenario: Verify User can search content from search bar on Youtube Homepage
    When User type "The Beatles" on search bar
    And User click search button
    Then User see content contains "The Beatles" on the title on search result

  @case4
  Scenario: Verify User can open Youtube ad page from Youtube Homepage
    When User click Get it now button on Youtube ad from Youtube Homepage
    Then User see Youtube ad page is opened

  @case5
  Scenario: Verify User see Trending section contents on Youtube Homepage
    When User scroll down Youtube Homepage
    Then User see Trending section is displayed

