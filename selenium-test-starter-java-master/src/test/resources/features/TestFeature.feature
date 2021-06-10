Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
   # Given I go to url https://www.bbc.co.uk/
    Given I navigate to the BBC website https://www.bbc.co.uk/
		When I can log in with the following kerry-anne.kane@opencastsoftware.com and mypassword1
		Then The user should signed in successfully

    

