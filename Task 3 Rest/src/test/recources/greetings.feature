Feature: Access greetings endpoint

  Scenario: Get the greeting from endpoint
    When The user sends the GET request to the endpoint
    Then The HTTP status is OK
