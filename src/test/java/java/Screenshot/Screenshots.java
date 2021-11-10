package Screenshot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BasePkg.BaseClass;

public class Screenshots extends BaseClass implements ITestListener {

	public Screenshots() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void takescreenshot() throws IOException {
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		String date=s.format(new Date(0));		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Amit\\workspace\\Pom.OrangeHRM\\resources\\Screenshot\\" + date + ".jpeg" ));
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
	try {
		takescreenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test execution has been started");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test execution has been finished");
		
	}
}
