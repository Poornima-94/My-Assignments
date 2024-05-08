package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url -> get() -> Load a new web page in the current browser window
		driver.get("https://www.leafground.com/radio.xhtml");
		
		// to maximize the window
		driver.manage().window().maximize();
		
		// apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// favorite browser select
				
				driver.findElement(By.xpath("//label[contains(text(),'Chrome')]")).click();
				
				//Click on a radio button, 
				driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).click();
			
				//get title
				System.out.println(driver.getTitle());
			//then click on the same radio button again to verify that it becomes ‘unselected’.
				driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).click();
				
				//Identify the radio button that is initially selected by default.
				System.out.println(driver.findElement(By.xpath("//label[text()='Safari']")).isEnabled());
				
				//Check and select the age group (21-40 Years) if not already selected.
				System.out.println(driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled());
				
				//to close the browser
				driver.close();
						
}

	
}
