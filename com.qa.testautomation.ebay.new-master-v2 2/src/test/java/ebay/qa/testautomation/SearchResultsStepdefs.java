package ebay.qa.testautomation;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;

public class SearchResultsStepdefs implements En {
    public static WebDriver driver=null;
    SearchResultsPageActions searchResultsPageActions= new SearchResultsPageActions();

    public SearchResultsStepdefs() {
        Given("^I am a non-registered customer$", () -> {

        });
        And("^I navigate to www\\.ebay\\.co\\.uk$", () -> {
            SeleniumDriver.openPage();
            SeleniumDriver.waitForPageToLoad();
            searchResultsPageActions.isRegisterDisplayed();
        });
        When("^I search for an item$", () -> {
        searchResultsPageActions.SearchForAnyThingByText();
        searchResultsPageActions.clickOnSearchButton();
        });
        Then("^I get a list of matching results$", () -> {

        });
        And("^the resulting items cards show: postage price, No of bids, price or show BuyItNow tag$", () -> {
            searchResultsPageActions.isPostagePricePresentInResultSetItems();
            searchResultsPageActions.isNoOfBidsPresentInResultSetItems();
            searchResultsPageActions.isPricePresentInResultSetItems();
            searchResultsPageActions.isBuyItNowTagPresentInResultSetItems();
        });
        Then("^I can sort the results by Lowest Price$", () -> {
            searchResultsPageActions.selectByLowestPrice();
        });
        And("^the results are listed in the page in the correct order$", () -> {

        });
        Then("^I can sort the results by Highest Price$", () -> {
            searchResultsPageActions.selectByHighestPrice();
        });
        Then("^I can filter the results by 'Buy it now'$", () -> {
            searchResultsPageActions.clickToFilterByBuyItNow();
        });
        And("^all the results shown in the page have the 'Buy it now' tag$", () -> {
            searchResultsPageActions.confirmAllBuyItNowTagsOnResultSetItems();
        });

    }
}
