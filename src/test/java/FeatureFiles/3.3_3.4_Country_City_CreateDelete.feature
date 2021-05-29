Feature: Country and Cities Create Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and delete a Country and a Cities

    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | country    |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | Group5Country |
      | codeInput | 007           |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed



    And Click on the element in the left class
      | cities     |

    And Click on the element in the content class
      | addButton     |
      | countrySelect |
      | Group5Country |

    When User sending the keys in the form content class
      | nameInput |  Group5City |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed


    And Click on the element in the left class
      | country    |

    When User delete the "Group5Country"

    Then Error message should be displayed