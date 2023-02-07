package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public class locatorlogin {
	WebDriver driver;
	public locatorlogin(WebDriver driver) {
		this.driver=driver;
	}
	By loginid=By.xpath("//input[@id=\"user-name\"]");
	By loginpassword=By.xpath("//input[@id=\"password\"]");
	By loginbutton=By.xpath("//input[@id=\"login-button\"]");
	
	
	@Step("Trigger url")
	public void Trigger_url(String url) {
		this.driver.get(url);
	}
	
	@Step
	public void getuserid() {
		driver.findElement(loginid).sendKeys("problem_user");
	}
	@Step
	public void password() {
		driver.findElement(loginpassword).sendKeys("secret_sauce");
	}
	@Step
	public void loginButton() {
		driver.findElement(loginbutton).click();
	}
	@Step
	public String url() {
		String Url=driver.getCurrentUrl();
		return Url;
		
	}

}
