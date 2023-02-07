package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Step;

public class Resources {
	WebDriver driver;
	public Resources(WebDriver driver) {
		this.driver=driver;
	}
	By resources=By.xpath("//ul[@class=\"nav-menu-list\"]//a[contains(text(),\"Resources\")]");
	By traning=By.xpath("//ul[@class=\"nav-menu-list\"]//span[contains(text(),\"Training & Support\")]");
	By cooking=By.xpath("//a[@class=\"link has-chevron is-primary\"]");
	By button=By.xpath("//a[@href=\"/sauce-basics/\"]//button[@class=\"button-dark\"]");
//	By click=By.xpath("//li[@id=\"docsearch-item-0\"]//span[@class=\"DocSearch-Hit-title\"]");
//	By popbutton=By.xpath("//input[@class=\"DocSearch-Input\"]");
	By verify=By.xpath("//h2[@id=\"security-at-sauce-labs\"]");
	
	
	
	@Step 
	public void resour() {
		WebElement ele=driver.findElement(resources);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	@Step
	public void Traning() {
		driver.findElement(traning).click();
	}
	@Step
	public void cook() {
		WebElement elt=driver.findElement(cooking);
		elt.click();
	}
	@Step 
	public void Buttom() {
		driver.findElement(button).click();
	}
	@Step
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
	}
//	@Step
//	public void Pop() throws InterruptedException {
//		driver.findElement(popbutton).sendKeys("Breadcrumbs");
//		Thread.sleep(3000);
//		driver.findElement(click).click();
//	}
	@Step
	public String verifytext() {
		String str=driver.findElement(verify).getText();
		return str;
	}
	

}
