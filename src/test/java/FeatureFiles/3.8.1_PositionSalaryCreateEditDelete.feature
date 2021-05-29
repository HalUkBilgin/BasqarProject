Feature: Position Salary Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Position Salary

    And Click on the element in the left class
      | humanResources |
      | setup3         |
      | positionSalary |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | inputNamePositionSalary | Tester|

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed

    When User edit the "Tester" to "Development"

    Then Success message should be displayed

    When User delete the "Development"

    Then Success message should be displayed