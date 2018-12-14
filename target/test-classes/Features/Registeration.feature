Feature: US22123 Register an Account on FreeCrm

  Scenario: Adding valid credentials user info
    
    Given I open the browser
    When I navigate to the FreeCrm 
    And I enter "Ali" and "Shokriyan"
    And I enter "ali_shokriyan@yahoo.com" and "alishokriyan" and "pasword1345!"  
    And Checked the terms and conditions button
    And Click on submit button
    Then I succesfully created an account

