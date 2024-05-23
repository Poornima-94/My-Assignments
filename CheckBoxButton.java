package week3.homeassignments;

public class CheckBoxButton extends Button {

	
	
	//CheckBoxButton
		public void clickCheckButton()
		{
			System.out.println("clickCheckButton method from CheckBoxButton class");
		}
		
		//RadioButton
		public void selectRadioButton()
		{
			System.out.println("clickCheckButton method from CheckBoxButton class");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxButton chk=new CheckBoxButton();
		chk.clickCheckButton();
		chk.submit();
	}

}
