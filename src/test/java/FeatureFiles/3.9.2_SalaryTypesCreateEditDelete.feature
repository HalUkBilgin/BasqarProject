Feature: Salary Types Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Salary Types

    And Click on the element in the left class
      | humanResources |
      | setup3         |
      | salaryTypes    |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | Dolar|

    And Click on the element in the content class
      | salaryUserType       |
      | salaryUserTypeOption |
      | saveButton           |

    Then Success message should be displayed

    When Salary Types User edit the "Dolar" to "Euro"

    Then Success message should be displayed

    When User delete the "Euro"

    Then Success message should be displayed