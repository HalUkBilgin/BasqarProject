Feature: Subject Categories Create Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Subject Categories

    And Click on the element in the left class
      | education         |
      | setup5            |
      | subjectCategories |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | MySubjectCategories |
      | codeInput | mycod99             |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed


  Scenario: Create a Subjects

    And Click on the element in the left class
      | education |
      | setup5    |
      | subject   |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the form content class
      | nameInput | Trigonometry |
      | codeInput | mate99       |

    And Click on the element in the content class
      | subjectCategory |
      | subjectOption   |
      | style           |
      | subjectOption   |
      | saveButton      |

    Then Success message should be displayed


  Scenario: Delete a Subject Categories

    And Click on the element in the left class
      | education         |
      | setup5            |
      | subjectCategories |

    When User delete the "MySubjectCategories"

    Then Error message should be displayed