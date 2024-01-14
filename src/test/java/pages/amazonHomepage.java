package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonHomepage {
	
	WebDriver driver;
	
	public amazonHomepage(WebDriver dr) {
	
	driver = dr;
   PageFactory.initElements(driver,this);

  }
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement signInButton;
	
	@FindBy(xpath = "//a@id='nav-orders']")
	WebElement ReturnOrders;
	
	@FindBy(xpath = "//a@id='nav-cart']")
	WebElement Cart;
	
	@FindBy(xpath ="//*[contains(text(),'Amazon Basics')]")
	WebElement AmazonBasics;
	
	@FindBy(xpath ="//a[@class='nav-a' and contains(text(), 'Customer Service')]")
	WebElement CustomerService;
	
	  @FindBy(id="results")
	   	WebElement searchResult;
	
	public void clickOnsignButtonInHomepage() {
		
		signInButton.click();
	}
	public void clickOnReturnOrders() {
		
		ReturnOrders.click();
	}
	
	public void Cart() {
		Cart.clear();
	}
	
	public void AmazonBasics() {
		AmazonBasics.click();
	}
	
	public void CustomerService() {
		CustomerService.click();
		
	}
	
    public boolean verifySearchResults() {
    	
    	return searchResult.isDisplayed();
    }
}

