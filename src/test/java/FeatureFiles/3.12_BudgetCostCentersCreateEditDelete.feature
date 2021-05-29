Feature: Cost Centers Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Cost Centers

    And Click on the element in the left class
      | budget      |
      | setup6      |
      | CostCenters |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | MyBudgetCostCenters |
      | codeInput | 007                 |

    And Click on the element in the content class
      | type        |
      | typeOptions |

    When User sending the keys in the form content class
      | orderNoInput | 5 |

    And Click on the element in the content class
      | expenceAccoundcode        |
      | expenceAccoundcodeOptions |
      | saveButton                |

    Then Success message should be displayed

    When Cost Centers User edit the "MyBudgetCostCenters" to "BudgetCostCenters"

    Then Success message should be displayed

    When User delete the "BudgetCostCenters"

    Then Success message should be displayed