@YoutubeHome
Feature: Youtube Home

  Background:
    Given user access youtube homepage

  @case1
  Scenario: Verify User can open Youtube Channel from Youtube Homepage
    When User click avatar from user number 1 from Youtube Homepage
    Then User see user youtube channel is opened

  @case2
  Scenario: Verify User can see Recently Uploaded filter on Youtube Homepage
    When User click arrow right button on filter bar 2 times
    Then User see "Recently Uploaded" filter on Youtube Homepage

  @case3
  Scenario: Verify User can open watch history from Youtube Homepage
    When User click "History" button on Youtube Homepage sidebar
    Then User see watch history page is opened

  @case4
  Scenario: Verify User can click share on content from Youtube Homepage
    When User click action button on content number 1
    And User click "share" button on content action menu
    Then User see share popup is displayed

  @case5
  Scenario: Verify User can add content to queue from Youtube Homepage
    When User click action button on content number 2
    And User click "Add to queue" button on content action menu
    Then User see mini player is opened with content paused

