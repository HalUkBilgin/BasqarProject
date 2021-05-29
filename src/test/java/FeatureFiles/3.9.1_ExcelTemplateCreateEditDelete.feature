Feature: Excel Template Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create, edit and delete a Excel Template

    And Click on the element in the left class
      | reports       |
      | setup7        |
      | excelTemplate |

    And Click on the element in the content class
      | addButtonReports |

    When User sending the keys in the form content class
      | nameInput | MyExcelTemplate|

    And Click on the element in the content class
      | saveButton |

    When User sending the keys in the form content class
      | rowSizeExcelTemplate    | 5 |
      | columnSizeExcelTemplate | 7 |

    And Click on the element in the content class
      | addVersion |
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the content class
      | closeButton |

    When Excel Template User edit the "MyExcelTemplate" to "ExcelTemplate"

    Then Success message should be displayed

    And Click on the element in the content class
      | closeButton |

    When User delete the "ExcelTemplate"

    Then Success message should be displayed