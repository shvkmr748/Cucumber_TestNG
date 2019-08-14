package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.Baseclass;

public class Checkboxes extends Baseclass{

	

	public static void checkbox_validation() {
		
		Wd.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		wdw = new WebDriverWait(Wd,2000);
		WebElement checkbox= Wd.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		wdw.until(ExpectedConditions.visibilityOf(checkbox));
		Wd.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	}

}
