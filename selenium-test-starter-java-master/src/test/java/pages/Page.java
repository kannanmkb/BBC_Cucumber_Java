package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();
    private By signIn_Initial = By.xpath("//span[contains(text(),'Sign in')]");
    private By userName = By.id("user-identifier-input");
    private By password = By.id("password-input");
    private By sign_Login = By.id("submit-button");
    private By success_SignIn = By.xpath("//span[contains(text(),'Your account')]");

    public void getUrl(final String url) {
        driver.navigate().to(url);
    }
    
    public void clickSignInIntial() {
        driver.findElement(signIn_Initial).click();
    }

    
    public void enterUserName(final String username) {
    	driver.findElement(this.userName).sendKeys(username);
    }

    public void enterPassword(final String password) {
    	driver.findElement(this.password).sendKeys(password);
    }
    
    public void clickSignInLogin() {
        driver.findElement(sign_Login).click();
    }
    
    public void verifySignIn() {
    	boolean isYourAccountPresent = false;
    	try {
    		driver.findElement(success_SignIn);
    		isYourAccountPresent = true;
    	}
    	catch(Exception e){
    		isYourAccountPresent = false;
    	}
    	
        Assert.assertTrue("The sign in is failed", isYourAccountPresent);
    }



}
