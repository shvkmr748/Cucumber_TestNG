package reusableComponents;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitiation extends Baseclass{
	
	
	public static void open_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\syl9691\\Downloads\\BDD_1\\BDD\\Drivers\\chromedriver.exe");
		Wd = new ChromeDriver();
		Wd.manage().window().maximize();
		Wd.get("http://the-internet.herokuapp.com/");
	}
	
	public static void close_browser() {
		
		Wd.quit();
	}
}
