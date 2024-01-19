package eleven36.com.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import eleven36.com.TestComponents.Retry;
import eleven36.com.TestComponents.BaseTestBS;

public class LoginTest extends BaseTestBS{
	//String productName = "ZARA COAT 3";

	@Test
	public void Validlogin()
	{

		
		getStarted = loginPage.loginApplication("sgka6475@gmail.com", "Test@2006");
		Boolean match = getStarted.VerifyGetStartedPageDisplayed();
		Assert.assertTrue(match);
	}
	

	
	//Extent Reports - 
	
	
	//@DataProvider
	//public Object[][] getData() throws IOException
	//{

		
		//List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//eleven36//com//Data//LoginCreds.json");
		//return new Object[][]  {{data.get(0)}};
		
	//}
	

	  
	
	
	
	
	
	
	
	


}
