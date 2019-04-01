package ebay.qa.testautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.stream.Collectors;


import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class SearchResultsPageActions {
    SearchResultsPageLocators searchResultsPageLocators=null;

    public SearchResultsPageActions()
    {
        this.searchResultsPageLocators=new SearchResultsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), searchResultsPageLocators);
    }
    public void clickToFilterByBuyItNow()
    {
        searchResultsPageLocators.filterByBuyItNowButton.click();
    }
    public void clickOnSearchButton()
    {

        searchResultsPageLocators.searchButton.click();

    }
    public void SearchForAnyThingByText()
    {
        //moveToCarsForSaleMenu();
        searchResultsPageLocators.searchForAnyThing.sendKeys("Nintendo Switch");

    }
    public void selectByHighestPrice()
    {
        Select selectHighestPrice=new Select(searchResultsPageLocators.selectHighestPriceDropDown);
        selectHighestPrice.selectByVisibleText("Highest Price");

    }
    public void selectByLowestPrice()
    {
        Select selectHighestPrice=new Select(searchResultsPageLocators.selectLowestPriceDropDown);
        selectHighestPrice.selectByVisibleText("Lowest Price");

    }
    public boolean isPostagePricePresentInResultSetItems() {
        try {
            String showingPostagePricePresentInResultSetItems = searchResultsPageLocators.resultSetItems.getText();
            boolean isPostagepricePresent = showingPostagePricePresentInResultSetItems.contains("Free Postage");
            return isPostagepricePresent;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isNoOfBidsPresentInResultSetItems() {
        try {
            String showingNoOfBidsPresentInResultSetItems = searchResultsPageLocators.resultSetItems.getText();
            boolean isNoOfBidsPresent = showingNoOfBidsPresentInResultSetItems.contains("0 bids");
            return isNoOfBidsPresent;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isPricePresentInResultSetItems() {
        try {
            String showingPricePresentInResultSetItems = searchResultsPageLocators.resultSetItems.getText();
            boolean isPricePresent = showingPricePresentInResultSetItems.contains("£230.00");
            return isPricePresent;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isBuyItNowTagPresentInResultSetItems() {
        try {
            String showingBuyItNowTagPresentInResultSetItems = searchResultsPageLocators.resultSetItems.getText();
            boolean isBuyItNowTagPresent = showingBuyItNowTagPresentInResultSetItems.contains("Buy It Now");
            return isBuyItNowTagPresent;
        } catch (Exception e) {
            return false;
        }
    }
    public void confirmAllBuyItNowTagsOnResultSetItems() {

        List<WebElement> ResultSetItems = (List<WebElement>) searchResultsPageLocators.resultSetItems;

        for (int i = 0; i < ResultSetItems.size(); i++) {
            WebElement allBuyItNowTag = ResultSetItems.get(i);
            String actualBuyItNowTag = allBuyItNowTag.getText();
            System.out.println(actualBuyItNowTag);

            boolean status = allBuyItNowTag.isDisplayed();
            assertTrue(status);

        }

    }
        public boolean isRegisterDisplayed() {
            try {
                String showingRegister = searchResultsPageLocators.nonRegistered.getText();
                boolean isRegisterDisplayed = showingRegister.contains("register");
                return isRegisterDisplayed;
            } catch (Exception e) {
                return false;
            }

        }
    }
