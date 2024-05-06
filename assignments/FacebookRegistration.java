package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url -> get() -> Load a new web page in the current browser window
		driver.get("https://en-gb.facebook.com/");
		// to maximize the window
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click on the Create new account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	
		// Enter the First name.
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Zaara");
		// Enter the Surname.
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Antony");
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("zaara071123@gmail.com");
		
		//Enter the New password.
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("PoorniZaara@24");
        //Handle all three dropdowns in Date of birth
		//locate day dropdown
	WebElement	dayDD=driver.findElement(By.xpath("//select[@id='day']"));
		//instantiate the Select class
		Select s1 =new Select(dayDD);
		//select day dropdown by value
		s1.selectByIndex(10);
		//locate Month Dropdown
		WebElement	monthDD=driver.findElement(By.xpath("//select[@id='month']"));
		//instantiate the Select class
		Select s2 =new Select(monthDD);
		//select day dropdown by value
		s2.selectByVisibleText("Jul");
		//locate year Dropdown
				WebElement	yearDD=driver.findElement(By.xpath("//select[@id='year']"));
				//instantiate the Select class
				Select s3 =new Select(yearDD);
				//select day dropdown by value
				s3.selectByValue("2023");
		//Select the radio button in Gender.
			driver.findElement(By.xpath("//label[text()='Female']")).click();
			//click signup
			//driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		// verify the title
		System.out.println(driver.getTitle());
	}

}
