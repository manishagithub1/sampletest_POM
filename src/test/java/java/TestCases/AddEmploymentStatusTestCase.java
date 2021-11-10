package TestCases;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.AddEmploymentStatusPO;
import PageObject.AddJobTitlesPO;

@Listeners(Screenshot.Screenshots.class)
public class AddEmploymentStatusTestCase extends BaseClass {
	public AddEmploymentStatusTestCase() throws FileNotFoundException, IOException {
		super();
	}

	@Test
	public void AddEmploymentStatus() throws InterruptedException, AWTException {
		AddEmploymentStatusPO ap = PageFactory.initElements(driver, AddEmploymentStatusPO.class);
		ap.AddEmploymentStatus();
	}

}
