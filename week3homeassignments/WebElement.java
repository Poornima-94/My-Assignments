package week3.week3homeassignments;

public class WebElement {

	//WebElement class
	public void click()
	{
		System.out.println("Click method from WebElement class");
	}
	public void setText() {
		System.out.println("setText method from WebElement class");
	}
	
	//Button Class
	public void submit()
	{
		System.out.println("Submit method from Button class");
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebElement web=new WebElement();
		 web.click();
		 web.setText();
	}

}






/*
 * Assignment Details:
 * 
 * Create classes for WebElement, Button, TextField, CustomButton, and
 * RadioButton to demonstrate various types of inheritance.
 * 
 * Assignment Requirements:
 * 
 * Base Class: WebElement - Create a base class named WebElement with common
 * methods such as click() and setText(String text). Subclasses: Button and
 * TextField - Implement two subclasses, Button and TextField, both inheriting
 * from the WebElement base class. - In the Button subclass, include a submit()
 * method. - In the TextField subclass, include a getText() method. Additional
 * Subclass: CheckBoxButton - Develop a new class named CheckBoxButton that
 * inherits from the Button subclass. - In the CheckBoxButton class, introduce a
 * method named clickCheckButton(). Another Subclass: RadioButton - Create
 * another subclass named RadioButton, also inheriting from the Button subclass.
 * - In the RadioButton class, add a method called selectRadioButton().
 * Execution Class: Elements - Create execution class named , also inheriting
 * from the Button subclass.
 */