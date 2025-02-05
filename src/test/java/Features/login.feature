Feature: Login Functionality

  Background: 
    Given User is Navigated to Login page

  Scenario Outline: Check login with valid credentials
    When User Enter Valid Email <ValidEmail>
    And User Enter Valid Password <Validpassword>
    And Clicked on Login button
    Then User should log-in successfully
    And User should navigate to account page

    Examples: 
      | ValidEmail       | Validpassword |
      | somesh@gmail.com | Test@1234     |

  Scenario Outline: Check Login with Invalid Email and Password
    When User Enter Invalid Email <InvalidEmail>
    And User Enter Valid Password <Invalidpassword>
    And Clicked on Login button
    Then User should not log-in
    And User should disply valid error worning <Error_worning>

    Examples: 
      | InvalidEmail     | Invalidpassword | Error_worning                                         |
      | test01@gmail.com |            1234 | Warning: No match for E-Mail Address and/or Password. |

  @singleTest
  Scenario Outline: Check Login with Invalid Email and Valid Password
    When User Enter Invalid Email <InvalidEmail>
    And User Enter Valid Password <Validpassword>
    And Clicked on Login button
    Then User should not log-in
    And User should disply valid error worning <Error_worning>

    Examples: 
      | InvalidEmail     | Validpassword | Error_worning                                         |
      | test01@gmail.com | Test@1234     | Warning: No match for E-Mail Address and/or Password. |
