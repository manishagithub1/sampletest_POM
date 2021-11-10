package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.HomePO;
import Screenshot.Screenshots;

@Listeners(Screenshot.Screenshots.class)
public class HomePOTestCase extends BaseClass {

	public HomePOTestCase() throws FileNotFoundException, IOException {
		super();
	}

	@Test
	public void HomePageAdminOperation1() throws InterruptedException {
		HomePO hp = PageFactory.initElements(driver, HomePO.class);
		hp.ClickOnUser(driver);
	}


/*
	@Test
	public void HomePageAdminOperation2() throws InterruptedException {
		HomePO hp1 = PageFactory.initElements(driver, HomePO.class);
		hp1.ClickOnJobTitles(driver);
	}
*/


	@Test
	public void HomePageAdminOperation3() throws InterruptedException {
		HomePO hp2 = PageFactory.initElements(driver, HomePO.class);
		hp2.ClickOnEmploymentStatus(driver);
	}

}

