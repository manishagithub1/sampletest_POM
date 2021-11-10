package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobTitlesPO {

	public static void FindJobTitles(WebDriver driver) {
		// Code to find element: Find Job Titles
		List<WebElement> TotalRows = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
		List<WebElement> TotalColumns = driver.findElements(By.xpath("//table[@id='resultTable']//tr[1]//td"));
		System.out.println(TotalRows.size());
		System.out.println(TotalColumns.size());

		for (int i = 1; i <= TotalRows.size() - 1; i++) {
			for (int j = 1; j <= TotalColumns.size() - 1; j++) {
				WebElement jobtitles = driver
						.findElement(By.xpath("//table[@id='resultTable']//tr[" + i + "]//td[" + j + "]"));
				if (jobtitles.getText().contains("Customer Success Manager")) {
					jobtitles2 = driver
							.findElement(By.xpath("//table[@id='resultTable']//tr[" + i + "]//td[1]"));
				}

			}
		}

	}
	
public static WebElement jobtitles2;
	
	@FindBy(id= "btnDelete")
	WebElement btnDelete;
	
	@FindBy(id= "dialogDeleteBtn")
	WebElement btnAlertDelete;
	
	public void Deletejobtitles(WebDriver driver) throws InterruptedException {
		FindJobTitles(driver);
		jobtitles2.click();
		Thread.sleep(1000);
		btnDelete.click();
		Thread.sleep(1000);
		btnAlertDelete.click();	
		Thread.sleep(1000);
	}

}
