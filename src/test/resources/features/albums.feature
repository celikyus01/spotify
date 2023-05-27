Feature: Albums CRUD Operations

  Scenario: Get Albums
    Given I get albums with id "4aawyAB9vmqN3uQ7FjRGTy" and country "US"
    And I verify 200 status code