package week3.homeassignments;

public class TextField {
	//WebElement class
		public void click()
		{
			System.out.println("Click method from WebElement class");
		}
		public void setText() {
			System.out.println("setText method from WebElement class");
		}
		//TextField class
		public void getText() {
			System.out.println("getText method from TextField class");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField tf=new TextField();
		tf.click();
		tf.getText();
		tf.setText();
	}

}


/*
 * Assignment Details:
 * 
 * - Create a superclass with methods - Then create a subclass that inherits
 * from the superclass
 * 
 * Requirements:
 * 
 * - Create a superclass as TestData. Implement 2 methods: enterCredentials(),
 * navigateToHomePage() in the TestData class. - Create subclasses and create 2
 * methods in each LoginTestData - enterUsername() - enterPassword() -
 * Demonstrate the concept by creating objects for both classes and calling
 * their methods.
 */