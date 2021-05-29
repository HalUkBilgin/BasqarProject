Feature: Bank Accounts Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Bank Accounts

    And Click on the element in the left class
      | setupOne     |
      | parameters   |
      | bankAccounts |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | Commerzbank      |
      | ibanInput | DE32074567455678 |

    And Click on the element in the content class
      | currency       |
      | currencyOption |

    When User sending the keys in the form content class
      | integrationCodeInput | 007 |

    And Click on the element in the content class
      | saveButton |

    When Bank Accounts User edit the "Commerzbank" to "DenizBank "

    Then Success message should be displayed

    When User delete the "DenizBank"

    Then Success message should be displayed