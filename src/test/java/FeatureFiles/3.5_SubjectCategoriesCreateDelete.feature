Feature: Subject Categories Create Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and delete a Subject Categories

    And Click on the element in the left class
      | education         |
      | setup5            |
      | subjectCategories |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | Economic disciplines |
      | codeInput | 007                  |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed

    When User delete the "Economic disciplines"

    Then Success message should be displayed