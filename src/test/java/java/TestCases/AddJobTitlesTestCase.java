package TestCases;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.AddJobTitlesPO;
import PageObject.JobTitlesPO;

@Listeners(Screenshot.Screenshots.class)
public class AddJobTitlesTestCase extends BaseClass {
		public AddJobTitlesTestCase() throws FileNotFoundException, IOException {
		super();
	}

		@Test
		public void Addjobtitles() throws InterruptedException, AWTException {
			AddJobTitlesPO jp1 = PageFactory.initElements(driver, AddJobTitlesPO.class);
			jp1.Addjobtitles(driver);
		}

	}

