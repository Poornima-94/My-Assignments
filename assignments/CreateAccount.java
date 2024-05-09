package week2.assignments;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class CreateAccount {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			// Launch the chrome browser
			ChromeDriver driver = new ChromeDriver();
			
			// Load the url -> get() -> Load a new web page in the current browser window
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			// to maximize the window
			driver.manage().window().maximize();
			
			// apply implicit wait
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
					// Locate the username text field
		//	WebElement eleUsername = driver.findElement(By.id("username"));
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
			// enter the password in the password field
					
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			
			// Click on the Login button
			
			driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
			//click on CRMSFA link
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
						
			//Click on the "Accounts" tab.
			driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
			Thread.sleep(8000);
			
			//Click on the "Create Account" button.
			driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
			//Enter an account name.
			driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Poorni");
			//Enter a description as "Selenium Automation Tester."
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester2");
			//// locate the industry dropdown
		WebElement indDD =	driver.findElement(By.xpath("//select[contains(@class,'inputBox')]"));
		//instantiate the select class
		         Select sec=new Select(indDD);
		       //Select "ComputerSoftware" as the industry. 
		         sec.selectByIndex(3);
			
		         //locate Ownership dropdown
		     WebElement ownDD =driver.findElement(By.xpath("//select[contains(@name,'ownershipEnumId')]"));
		     //instantiate the select class
		     Select sec1=new Select(ownDD);
		   //Select "S-Corporation" as ownership using SelectByVisibleText
		     sec1.selectByVisibleText("S-Corporation");
		     //locate the source dropdown
		     
		     WebElement souDD =driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		   	     //instantiate the select class
		   	     Select sec2=new Select(souDD);
		   		 
			//Select "Employee" as the source using SelectByValue.
		     sec2.selectByValue("LEAD_EMPLOYEE");
		     // locate the marketing campaign dropdown
		     WebElement mrcDD =driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		     //instantiate the class
		     Select sec3=new Select(mrcDD);
			//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		     sec3.selectByIndex(6);
		     //locate state/province dropdown
		     WebElement stateDD=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		     //instantiate the select class
		     Select sec4 =new Select(stateDD);
			//Select "Texas" as the state/province using SelectByValue.
		     sec4.selectByValue("TX");
			//Click the "Create Account" button.
		     driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			//Verify that the account name is displayed correctly.
			
			//to get the title -> getTitle() -> Get the title of the current page. 
					System.out.println(driver.getTitle());
					// Close the browser window.
					driver.close();
		}

	}
