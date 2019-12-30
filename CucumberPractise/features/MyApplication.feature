Feature: Test Facebook smoke scenario
  
  Scenario Outline: Test login with valid credentials 
  Given Open firefox and start application
  When I enter valid "<username>" and valid "<password>" 
  Then user should be able to login successfully
  

  Examples:
  |username|password|
  |fhk|123|
  |fhk1|1231|
  |fhk2|1232|
  