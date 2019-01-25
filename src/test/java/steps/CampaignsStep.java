package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.android.TestPage;

public class CampaignsStep {

    @Given("^I am on the campaigns mobile view$")
    public void i_am_on_the_campaigns_mobile_view() throws Throwable {
        new TestPage().testClick();
    }

    @Then("^I should see the \"(.*?)\" page$")
    public void i_should_see_the_page(String arg1) throws Throwable {
        new TestPage().loginClick();
    }

    @Then("^I should see a create campaign iconoing, Completed$")
    public void i_should_see_a_create_campaign_iconoing_Completed() throws Throwable {
         
    }

    @Then("^I should see the High Five confirmation and freddie hand displayed$")
    public void i_should_see_the_High_Five_confirmation_and_freddie_hand_displayed() throws Throwable {
         
    }


}
