package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	TakesScreenshot ss;
	
	public void takeSS(WebDriver driver, String s) throws IOException {
		ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File(s);
		
		FileUtils.copyFile(src,dest);
	}
}
