package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Step;

public class Button {
	WebDriver driver;
	public Button(WebDriver driver) {
		this.driver=driver;
	}
	By button=By.xpath("//button[@id=\"react-burger-menu-btn\"]");
	By about=By.xpath("//a[@id=\"about_sidebar_link\"]");
	By platform=By.xpath("//ul[@class=\"nav-menu-list\"]//div[@class=\"nav-menu-main-link has-sub-menu\"]//a[contains(text(),\"Platform\")]");
    By Integration=By.xpath("//div[@class=\"nav-menu-link-group-row-list-wrapper\"]//span[contains(text(),\"Integrations\")]");
    By verify=By.xpath("//div[@class=\"content-container\"]//ci");
    
    @Step
    public void ton() {
    	driver.findElement(button).click();
    }
    @Step
    public void aboutbutton() {
    	driver.findElement(about).click();
    }
    @Step
    public void platformhover() {
    	WebElement ele=driver.findElement(platform);
    	Actions act=new Actions(driver);
    	act.moveToElement(ele).perform();
    }
    @Step
    public void clickintegration() {
    	driver.findElement(Integration).click();
    }
    @Step
    public String verifytext() {
    	String text=driver.findElement(verify).getText();
    	return text;
    }
}
