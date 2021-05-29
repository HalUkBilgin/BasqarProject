Feature: Positions Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Positions

    And Click on the element in the left class
      | humanResources |
      | setup3         |
      | positions      |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | Development |
      | shortName | develop     |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed

    When Positions User edit the "Development" to "Tester"

    Then Success message should be displayed

    When User delete the "Tester"

    Then Success message should be displayed