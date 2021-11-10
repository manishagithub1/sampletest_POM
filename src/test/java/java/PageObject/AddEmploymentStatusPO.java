package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmploymentStatusPO {
	WebDriver driver;
	@FindBy(id = "btnAdd")
	WebElement btnAdd;
	
	@FindBy(id = "empStatus_name")
	WebElement txtempStatus_name;
	
	@FindBy(id = "btnSave")
	WebElement btnSave;
	
	public void AddEmploymentStatus() throws InterruptedException {
		btnAdd.click();
		Thread.sleep(2000);
		
		txtempStatus_name.clear();
		txtempStatus_name.sendKeys("Full Time Work");
		Thread.sleep(2000);
		
		btnSave.click();
		Thread.sleep(2000);
		
	}

}
