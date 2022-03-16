Feature: Transfer money, a lot of money

  Scenario: Transfer money from current account to savings account
    Given I have 1000 on currentAccount
    And I have 1000 on savingsAccount
    When I transfer 500 from currentAccount to savingsAccount
    Then Transfer executed