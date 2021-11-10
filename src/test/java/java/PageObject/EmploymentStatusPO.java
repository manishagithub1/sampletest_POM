package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EmploymentStatusPO {

	public static WebElement employmentstatus2;

	public static void FindEmploymentStatus(WebDriver driver) throws InterruptedException {
		// Code to find element: Find Employment Status
		List<WebElement> TotalRows = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
		List<WebElement> TotalColumns = driver.findElements(By.xpath("//table[@id='resultTable']//tr[1]//td"));
		System.out.println(TotalRows.size());
		System.out.println(TotalColumns.size());

		for (int i = 1; i <= TotalRows.size() - 1; i++) {
			for (int j = 1; j <= TotalColumns.size(); j++) {
				WebElement employmentstatus = driver
						.findElement(By.xpath("//table[@id='resultTable']//tr[" + i + "]//td[" + j + "]"));
				// System.out.println(employmentstatus.getText());
				Thread.sleep(1000);
				if (employmentstatus.getText().contains("Full Time Work")) {
					System.out.println(employmentstatus.getText());
					employmentstatus2 = driver
							.findElement(By.xpath("//table[@id='resultTable']//tr[" + i + "]//td[1]"));
				}

			}
		}

	}

	@FindBy(id = "btnDelete")
	WebElement btnDelete;

	@FindBy(id = "dialogDeleteBtn")
	WebElement btnAlertDelete;

	public void DeleteEmploymentStatus(WebDriver driver) throws InterruptedException {
		FindEmploymentStatus(driver);
		Actions a = new Actions(driver);
		a.moveToElement(employmentstatus2).click().build().perform();
		Thread.sleep(2000);
		btnDelete.click();
		Thread.sleep(2000);

		btnAlertDelete.click();
	}

}
