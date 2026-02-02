package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	public  By username=By.name("username");
	public  By password=By.name("password");
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		

	}
	
	public void setUserName(String name) {
		
	driver.findElement(username).sendKeys(name);
	}
	
	public void setPassword(String pass) {
		
	driver.findElement(password).sendKeys(pass);
	}

}
