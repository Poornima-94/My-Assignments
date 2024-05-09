package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			// Launch the chrome browser
			ChromeDriver driver = new ChromeDriver();
			
			// Load the url -> get() -> Load a new web page in the current browser window
			driver.get("http://leaftaps.com/opentaps/");
			
			// to maximize the window
			driver.manage().window().maximize();
		
			// apply implicit wait
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
					// Locate the username text field								
						driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
					
						// enter the password in the password field
						driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
						
						// Click on the Login button						
						driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
					
						//click on CRMSFA link
						driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
						
						//Click on Create Lead.
					WebElement createLead=	driver.findElement(By.xpath("//a[text()='Create Lead']"));
					createLead.click();
					System.out.println("CreateLead button is clicked");
						
					//Enter the CompanyName Field Using Xpath
						driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf1");
						System.out.println("CompanyName Field is updated as Testleaf1");
						
						//Enter the FirstName Field Using Xpath. 
						driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Poornima");
						System.out.println("FirstName Field is updated as Poornima");
						
						//- Enter the LastName Field Using Xpath. 
						driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("SP");
						System.out.println("LastName Field is updated as SP");
						
						//- Enter the FirstName (Local) Field Using Xpath. 
						driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Antony");
						System.out.println("FirstName (Local) Field is updated as Antony");
						
						//- Enter the Department Field Using any Locator of Your Choice.
						driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Selenium April'24 batch");
						System.out.println("Description:Selenium April'24 batch");
						
						//- Enter the Description Field Using any Locator of your choice.
						driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium Automation Learning1");
						System.out.println("Selenium Automation Learning1");
						
						//Enter your email in the E-mail address Field using the locator of your choice.
						driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("spoorni994@gmail.com");
						System.out.println("Email id:spoorni994@gmail.com");
						
						//-locate dropdown Select State/Province as NewYork Using Visible Text.
						WebElement dd=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
						
						//To Instantiate Class
						Select dd1=new Select(dd);
						
						//Select State/Province as NewYork Using Visible Text.
						dd1.selectByVisibleText("New York");
						System.out.println("State/Province is selected as New york");
						
						//- Click on the Create Button.
						driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
						System.out.println("Lead is created upon clicking on the create lead button");
						
						// Click on the edit button. 				
						driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
						System.out.println("Edit button is clicked");
						
						//- Clear the Description Field.
						driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
					    System.out.println("Description Field text is Empty");
					    
					    Thread.sleep(3000);
						//Fill the Important Note Field with Any text.
						driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Selenium Automation Learning");
						System.out.println("Important note:Selenium Automation Learning");
						
						//- Click on the update button. 
						driver.findElement(By.xpath("//input[@value='Update']")).click();
						System.out.println("Update Lead is clicked");
						
						//- Get the Title of the Resulting Page.
						System.out.println(driver.getTitle());
						
				        //- Close the browser window.
						driver.close();
						
						
	}

}
