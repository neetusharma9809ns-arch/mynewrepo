package tests;
import webPages.LoginPage;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.*;
import base.BaseTest;


public class LoginTest extends BaseTest{
	
	LoginPage loginP;
	   WaitUtils w;
	 
	     ConfigReader cc;
	  
	
	@BeforeMethod
    public void initPage() throws IOException {
        loginP = new LoginPage(driver);  
     w=new WaitUtils();
     w.waitUtil(driver, 30);
cc=new ConfigReader();
cc.loadProp();
    
    }





@Test
public void logintest() throws InterruptedException, IOException {
	
w.waitUntilElementVisible(loginP.username);

	loginP.setUserName(cc.getUserName());
	loginP.setPassword(cc.getPassword());
	
}

}
