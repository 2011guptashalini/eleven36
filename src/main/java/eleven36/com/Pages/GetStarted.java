package eleven36.com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eleven36.com.automation.AbstractComponents.AbstractComponents;

public class GetStarted extends AbstractComponents {
	WebDriver driver;
	public GetStarted(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement userEmails = driver.findElement(By.id("userEmail"));
			//PageFactory
			
	@FindBy(xpath="//span[@class='cx-login-greet d-none d-md-flex']")
	WebElement loggedIN;
			
		public Boolean VerifyGetStartedPageDisplayed() {
			Boolean match = loggedIN.isDisplayed();
			return match;


}
}
