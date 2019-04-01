package ebay.qa.testautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultsPageLocators {

    @FindBy(how= How.XPATH,using="//input[@type='text']")
    public WebElement searchForAnyThing;

    @FindBy(how=How.XPATH,using="//input[@type='submit']")
    public WebElement searchButton;

    @FindBy(how=How.XPATH,using="//a[@title='Buy it now']")
    public WebElement filterByBuyItNowButton;

    @FindBy(how=How.ID,using="Results")
    public WebElement resultsHolder;

    @FindBy(how=How.ID,using="ResultSetItems")
    public WebElement resultSetItems;

    @FindBy(how=How.XPATH,using="//a[text()='Best Match']")
    public WebElement selectHighestPriceDropDown;

    @FindBy(how=How.XPATH,using="//a[text()='Best Match']")
    public WebElement selectLowestPriceDropDown;

    @FindBy(how=How.XPATH,using="//a[text()='register']")
    public WebElement nonRegistered;

    @FindBy(how=How.XPATH,using="//*[span[text()='1,703']]")
    public WebElement searchTotalResults;


}
