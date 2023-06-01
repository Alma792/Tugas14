Feature: User

  Scenario: Get As admin I have be able to get all of detail user data
    Given I Set GET Endpoints
    When I Send GET HTTP Request
    Then I Receive Valid HTTP Response 200
    And I Receive User Valid Data

  Scenario: POST As admin I have be able to create a new user
    Given I Set POST Api Endpoints
    When I Send POST HTTP Request
    Then I Receive Valid HTTP Response Code 201
    And I Receive New User Valid Data

  Scenario: PUT As admin I have be able to update an existing user data
    Given I Set PUT API Endpoints
    When I Send PUT HTTP Request
    Then I Receive HTTP Response Code Valid 200

  Scenario: DELETE As admin I have be able to delete an existing user data
    Given I Set DELETE API Endpoints
    When I Send DELETE HTTP Request
    Then I Receive Valid HTTP Response Code 204