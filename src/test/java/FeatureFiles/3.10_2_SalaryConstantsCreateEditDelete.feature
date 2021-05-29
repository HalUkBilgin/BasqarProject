Feature: Salary Constants Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Salary Constants

    And Click on the element in the left class
      | humanResources  |
      | setup3          |
      | salaryConstants |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | salaryConstantNameInput | Compensation |

    And Click on the element in the content class
      | validFromInput |
      | calendar       |

    When User sending the keys in the form content class
      | keyInput   | COM  |
      | valueInput | 2500 |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed



    When User sending the keys in the form content class
      | searchNameInput   | Compensation  |

    And Click on the element in the content class
      | searchButton |

    When Salary Constants User edit the "Compensation" to "MySalaryConstant"

    Then Success message should be displayed



    When User sending the keys in the form content class
      | searchNameInput | MySalaryConstant |

    And Click on the element in the content class
      | searchButton |

    When User delete the "MySalaryConstant"

    Then Success message should be displayed