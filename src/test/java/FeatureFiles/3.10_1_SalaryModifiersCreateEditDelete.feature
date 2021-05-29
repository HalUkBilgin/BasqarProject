Feature: Salary Modifiers Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Salary Modifiers

    And Click on the element in the left class
      | humanResources  |
      | setup3          |
      | salaryModifiers |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | description | MySalaryModifier |
      | variable    | SECTION          |
      | priority    | 5                |
      | amount      | 250              |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed


    And Click on the element in the left class
      | humanResources  |
      | setup3          |
      | salaryModifiers |

    When Salary Modifiers User edit the "MySalaryModifier" to "SalaryModifier"

    Then Success message should be displayed


    And Click on the element in the left class
      | humanResources  |
      | setup3          |
      | salaryModifiers |

    When User delete the "SalaryModifier"

    Then Success message should be displayed