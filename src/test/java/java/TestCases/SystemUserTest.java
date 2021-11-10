package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.SystemUserPO;
import Screenshot.Screenshots;

@Listeners(Screenshot.Screenshots.class)
public class SystemUserTest extends BaseClass {

	public SystemUserTest() throws FileNotFoundException, IOException {
		super();
	}
	
	@Test
	public void deleteuser() throws InterruptedException {
		SystemUserPO sp=PageFactory.initElements(driver, SystemUserPO.class);
		sp.DeleteUser(driver);
	
	}
	

}
