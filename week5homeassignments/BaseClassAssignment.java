package week5homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassAssignment {
public static ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	
	public void preCondion(String Url,String UName, String Password) {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(UName);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();	
	}
	
	  public void postCondion() 
	  { 
		  driver.quit();
	  }
	 
}


