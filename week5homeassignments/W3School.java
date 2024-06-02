package week5homeassignments;

//import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class W3School {

			@DataProvider(name="registrationdata")
			public String[][] data() {
				
				String [][] dp=new String [1][9];
				
				dp[0][0]="Poornima Sakthivel";
				dp[0][1]="spoorni994@gmail.com";
				dp[0][2]="Sreepathy Nagar";
				dp[0][3]="TamilNadu";
				dp[0][4]="Coimbatore";
				dp[0][5]="641036";
				dp[0][6]="789";
				dp[0][7]="4561237894154512";
				dp[0][8]="Poornima SP";
				
				return dp;
			}
			
			@Test(dataProvider="registrationdata")
			public void W3SchoolData(String fullName,String email,String adress,String state,String city,String Zip,String CVV,String CCNumber,String CName) 
			{
				
				ChromeDriver driver = new ChromeDriver();
				// Load the url -> get() -> Load a new web page in the current browser window
				driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
				// to maximize the window
				driver.manage().window().maximize();
				//apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.switchTo().frame("iframeResult");
				
				driver.findElement(By.id("fname")).sendKeys(fullName);
				driver.findElement(By.id("email")).sendKeys(email);
				driver.findElement(By.id("adr")).sendKeys(adress);
				driver.findElement(By.id("state")).sendKeys(state);
				driver.findElement(By.id("city")).sendKeys(city);
				driver.findElement(By.id("zip")).sendKeys(Zip);
				driver.findElement(By.id("cvv")).sendKeys(CVV);
				driver.findElement(By.id("ccnum")).sendKeys(CCNumber);
				driver.findElement(By.id("cname")).sendKeys(CName);
				driver.findElement(By.id("expmonth")).sendKeys("Oct");
				driver.findElement(By.id("expyear")).sendKeys("2018");		
				 
				
			}	
		    
	}


