@Create_account
Feature: Create a Gmail Adress

  Scenario Outline: User Create a Gmail address
    When I open homepage of Google and open the creating gmail page
    Then I filed Up firstname "<username>" and lastName "<lastname>"
    Then I generate a user name
    And  I generate a  "<password>"  after then same as confimation
    And  I Click the Next
    And  I send a email "parhat19@gmail.com"
    Examples:
      | username | lastname | password |
      | parhat   | Osman    | 19961231 |
