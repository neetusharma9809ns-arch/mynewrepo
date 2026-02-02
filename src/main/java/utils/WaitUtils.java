package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	WebDriverWait wait;
public void waitUtil(WebDriver driver, int time) {
	
wait=new WebDriverWait(driver, Duration.ofSeconds(time));

}

public void waitUntilElementVisible(By webElement) {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
}
public void waitUntilElementClickable(By element) {
	
	wait.until(ExpectedConditions.elementToBeClickable(element));
}

	
	

}