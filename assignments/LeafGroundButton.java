package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url -> get() -> Load a new web page in the current browser window
		driver.get("https://leafground.com/button.xhtml");
		
		// to maximize the window
		driver.manage().window().maximize();
		
		//apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Click on the button with the text ‘Click and Confirm title.’
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				
				//Verify that the title of the page is ‘dashboard.’
				System.out.println(driver.getTitle());
				
				//To go back to the previous page
				driver.navigate().back();
				
				//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
				System.out.println(driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']")).isEnabled());
				
				//Find and print the position of the button with the text ‘Submit. ’
			System.out.println(driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']")).getLocation().getX());
			
			//Find and print the background color of the button with the text ‘Find the Save button color.’
			System.out.println(driver.findElement(By.xpath("//h5[text()='Find the Save button color']")).getCssValue("background-color"));
				
			//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
			System.out.println(driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getSize());
				
				//Close the browser window.
				driver.close();

	}

}
