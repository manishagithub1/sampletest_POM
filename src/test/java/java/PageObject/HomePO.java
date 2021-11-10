package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePO {

	// 1. Clicking on Admin-User Management-Users
	@FindBy(xpath = "//*[text()='Admin']")
	WebElement txtadmin;

	@FindBy(xpath = "//*[text()='User Management']")
	WebElement txtUserManagement;

	@FindBy(xpath = "//*[text()='Users']")
	WebElement txtUsers;

	public void ClickOnUser(WebDriver driver) throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(txtadmin).build().perform();
		a.moveToElement(txtUserManagement).build().perform();
		a.moveToElement(txtUsers).click().build().perform();
		Thread.sleep(2000);

	}
/*
	// 2. Clicking on Admin-Job-Job Titles
	@FindBy(xpath = "//*[text()='Admin']")
	WebElement txtadmin1;

	@FindBy(xpath = "//*[text()='Job']")
	WebElement txtJob;

	@FindBy(xpath = "//*[text()='Job Titles']")
	WebElement txtJobTitles;

	public void ClickOnJobTitles(WebDriver driver) throws InterruptedException {
		Actions a1 = new Actions(driver);
		a1.moveToElement(txtadmin1).build().perform();
		a1.moveToElement(txtJob).build().perform();
		a1.moveToElement(txtJobTitles).click().build().perform();
		Thread.sleep(1000);
	}
*/
	// 3. Clicking on Admin-Job-Employment Status

	@FindBy(xpath = "//*[text()='Admin']")
	WebElement txtadmin2;

	@FindBy(xpath = "//*[text()='Job']")
	WebElement txtJob2;

	@FindBy(xpath = "//*[text()='Employment Status']")
	WebElement txtEmploymentStatus;

	public void ClickOnEmploymentStatus(WebDriver driver) throws InterruptedException {
		Actions a1 = new Actions(driver);
		a1.moveToElement(txtadmin2).build().perform();
		a1.moveToElement(txtJob2).build().perform();
		a1.moveToElement(txtEmploymentStatus).click().build().perform();
		Thread.sleep(2000);
	}

}
