package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
	
	
	public WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By nameField = By.cssSelector("input[name='your-name']");
	public By emailField = By.cssSelector("input[type='email']");
	public By subjectField = By.cssSelector("input[name='your-s']");
	public By messageField = By.cssSelector("textarea[name='your-message']");
	public By sendMessageButton = By.cssSelector("input[value='Send Message']");
	public By confirmationMessage = By.cssSelector("div[class*='wpcf7-response-output']");
	

	public void sendMessage(String name, String email, String message) {
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(messageField).sendKeys(message);
		driver.findElement(sendMessageButton).click();
		
	}
	
    public boolean confirmationMsgIsDisplayed(By locator) {
		
		return driver.findElement(locator).isDisplayed();
		
	}
}
