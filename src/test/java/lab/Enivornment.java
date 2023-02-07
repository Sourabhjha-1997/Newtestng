package lab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public class Enivornment {
	WebDriver driver;
	public Enivornment(WebDriver driver) {
		this.driver=driver;
	}
	By Environment=By.xpath("//ul[@class=\"menu__list\"]//a[contains(text(),\"Using Environment Variables\")]");
	By username=By.xpath("//a[contains(text(),\"Username and Access Key\")]");
	By verify=By.xpath("//img[@class=\"top-bar-logo__img\"]");
	By tryfor=By.xpath("//a[@href=\"https://saucelabs.com/sign-up\"]");
	By verify2=By.xpath("p[@id=\"tagline\"]");
	
	@Step
	public void enivronment() {
		driver.findElement(Environment).click();
	}
	@Step
	public void uandp() {
		driver.findElement(username).click();
	}
	@Step
	public String Verify1() {
		String str=driver.findElement(verify).getText();
		return str;
	}
	@Step
	public  void Tryfor() {
		driver.findElement(tryfor).click();
	}
	@Step
	public String Verify2() {
		String mtr=driver.findElement(verify2).getText();
		return mtr;
	}
	@Step
	public void windowhandel() {
		Set<String>handels=driver.getWindowHandles() ;
		Iterator it=handels.iterator();
		String parent=(String)it.next();
		String child=(String)it.next();
	}
	@Step
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
	}

}
