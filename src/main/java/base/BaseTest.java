package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseTest {

	protected WebDriver driver;
	ConfigReader cr=new ConfigReader();

	@BeforeMethod
	public void setup() throws IOException {
		
	
		cr.loadProp();
		//adding
		
if(cr.getBrowser().equalsIgnoreCase("chrome")){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	

}
if(cr.getBrowser().equalsIgnoreCase("edge")){
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	
}	
		driver.get(cr.getURL());
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
