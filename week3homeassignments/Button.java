package week3.week3homeassignments;

public class Button extends WebElement{
	//WebElement class
		public void click()
		{
			System.out.println("Click method from WebElement class");
		}
		public void setText(){
			System.out.println("setText method from WebElement class");
		}
		
		//Button Class
		public void submit()
		{
			System.out.println("Submit method from Button class");
					
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button btn=new Button();
		btn.click();
		btn.setText();
		btn.submit();
	}

}
