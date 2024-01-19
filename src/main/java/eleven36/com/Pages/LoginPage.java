package eleven36.com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eleven36.com.automation.AbstractComponents.AbstractComponents;

public class LoginPage extends AbstractComponents {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmails = driver.findElement(By.id("userEmail"));
		//PageFactory
		
		// Cookies button
		@FindBy(xpath="//button[text()=' Allow All ']")
		WebElement allowCookiesBtn;
	
		//Account button
		@FindBy(xpath="//a[@class='loginLink']")
		WebElement accountEle;
		
		//Email field
		@FindBy(xpath="//input[@type='email']")
		WebElement emailEle;
		
		//Password field
		@FindBy(xpath="//input[@type='password']")
		WebElement passwordEle;
		
		//Submit Button
		@FindBy(xpath="//button[@type='submit']")
		WebElement submitBtn;
		
		//ErrorMessage
		@FindBy(xpath="//span[text()='Bad credentials. Please login again.']")
		WebElement badCredError;

		
		
		
	
		
		

		
		public GetStarted loginApplication(String email,String password)
		{
			//allowCookiesBtn.click();
			//waitForAWhile(10);
			
			//accountEle.click();
			//waitForAWhile(10);
			
			emailEle.sendKeys(email);
			waitForAWhile(10);
			
			passwordEle.sendKeys(password);
			waitForAWhile(10);
			
			submitBtn.click();
			waitForAWhile(10);
			
			GetStarted getStarted = new GetStarted(driver);
			return getStarted;
			
			
		}



		public void goTo(String url) {
			driver.navigate().to(url);
			// TODO Auto-generated method stub
			
		}

}
