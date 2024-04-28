package week2.day2;

public class Browser {

public String launchBrowser(String browserName) {
	
		System.out.println("Browser launched Successfully");
		return browserName;
}
public void loadUrl() {
	System.out.println("Application URL loaded Successfully");
	}
	
public static void main(String[] args) {
	
	Browser b=new Browser();
	b.launchBrowser("Chrome");
	b.loadUrl();
	}
}

	

	
