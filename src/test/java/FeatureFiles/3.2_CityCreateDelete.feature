Feature: Cities Create Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  @SmokeTest
  Scenario: Create and delete a Cities

    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | cities     |

    And Click on the element in the content class
      | addButton     |
      | countrySelect |
      | countryOption |

    When User sending the keys in the form content class
      | nameInput | Milano |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed

    When User delete the "Milano"

    Then Success message should be displayed