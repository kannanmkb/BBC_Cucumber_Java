package steps;

import cucumber.api.java8.En;
import pages.Page;

public class StepDefs extends Page implements En  {

    public StepDefs() {
        Given("^I navigate to the BBC website (.*)$", (final String url) ->  getUrl(url));
        
        When("^I can log in with the following (.*) and (.*)$" , 
        		(final String username, final String password) -> {
        			clickSignInIntial();
        			enterUserName(username);
        			enterPassword(password);
        			clickSignInLogin();
        		});
        Then("^The user should signed in successfully$" , () -> verifySignIn());

    }

}
