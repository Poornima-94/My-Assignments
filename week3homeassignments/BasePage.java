package week3.week3homeassignments;

public class BasePage {
	//findElement(), clickElement(), enterText() and performCommonTasks(). 
	public void findElement() {
		System.out.println("findElements from Baseclass");
	}
public void clickElement() {
		System.out.println("Click the Elements from Baseclass");
	}
public void enterText() {
	
	System.out.println("Enter the text from Baseclass");
}

public void performCommonTasks() {
	System.out.println("Perform common tasks from Baseclass");
	}

public static void main(String[] args) {
	
	BasePage BC=new BasePage();
	BC.findElement();
	BC.performCommonTasks();
	BC.enterText();
		
}
}
	



