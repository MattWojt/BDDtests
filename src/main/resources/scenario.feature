Feature: Some feature

#  Background:
#    Given open browser
#    And go to shop page
#    And add product to basket
#    And open basket view

    Scenario: use correct code
      When user input correct code
      Then discount is added to basket

      Scenario: incorrect code
        When user input incorrect code
        Then discount is not added toproduct price