package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddJobTitlesPO {
	WebDriver driver;
	@FindBy(id = "btnAdd")
	WebElement btnAdd;

	@FindBy(id = "jobTitle_jobTitle")
	WebElement txtjobTitle;

	@FindBy(id = "jobTitle_jobDescription")
	WebElement txtjobDescription;

	@FindBy(id = "jobTitle_jobSpec")
	WebElement btnjobSpec;

	@FindBy(id = "jobTitle_note")
	WebElement btnnote;

	@FindBy(id = "btnSave")
	WebElement btnSave;

	public void Addjobtitles(WebDriver driver) throws InterruptedException, AWTException {
		btnAdd.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		txtjobTitle.clear();
		txtjobTitle.sendKeys("officer3");
		Thread.sleep(2000);

		txtjobDescription.clear();
		txtjobDescription.sendKeys("office work3");
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		a.moveToElement(btnjobSpec).click().build().perform();
		Thread.sleep(3000);
		fileUpload();
		Thread.sleep(3000);

		btnnote.clear();
		btnnote.sendKeys("official work1");
		Thread.sleep(2000);
		
		btnSave.click();
		Thread.sleep(2000);

	}

	public void fileUpload() throws InterruptedException, AWTException {
		StringSelection path = new StringSelection("C:\\Users\\Amit\\DESKTOP\\fileupload.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Thread.sleep(3000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
