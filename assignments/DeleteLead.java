package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
				
				//Click the "Leads" link. - 
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				//Click "Find leads." -
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				//Click on the "Phone" tab. -
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				//Enter the phone number. - 
				driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
				//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("00");
				//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9003722274");
				//Click "Find leads." -
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				
				//Capture the lead ID of the first resulting lead. - 
				System.out.println(driver.findElement(By.xpath("//a[text()='10159']")).getText());
				//Click the first resulting lead. -
				driver.findElement(By.xpath("//a[text()='10159']")).click();
				//click Delete Lead button
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				
				//Click "Find leads" again. -
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				
				//Enter the captured lead ID. - 
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10159");
				//Click the "Find leads" button. 
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion. -
				
				//Close the browser. 
				driver.close();
			
				

	}

}
