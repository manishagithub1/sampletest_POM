package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.JobTitlesPO;
import PageObject.SystemUserPO;
import Screenshot.Screenshots;

@Listeners(Screenshot.Screenshots.class)
public class JobTitlesTestCase extends BaseClass {

	public JobTitlesTestCase() throws FileNotFoundException, IOException {
		super();
	}

	@Test
	public void Deletejobtitles() throws InterruptedException {
		JobTitlesPO jp = PageFactory.initElements(driver, JobTitlesPO.class);
		jp.Deletejobtitles(driver);
		Thread.sleep(2000);

	}

}
