package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.EmploymentStatusPO;
import PageObject.JobTitlesPO;

@Listeners(Screenshot.Screenshots.class)
public class EmploymentStatusTestCase extends BaseClass {

	public EmploymentStatusTestCase() throws FileNotFoundException, IOException {
		super();
	}
	
	@Test
	public void DeleteEmploymentStatus() throws InterruptedException {
		EmploymentStatusPO ep=PageFactory.initElements(driver, EmploymentStatusPO.class);
		ep.DeleteEmploymentStatus(driver);

	}
}
