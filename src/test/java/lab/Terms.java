package lab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Step;

public class Terms {
	WebDriver driver;
	public Terms(WebDriver driver) {
		this.driver=driver;
	}
	By terms=By.xpath("//a[@href=\"https://saucelabs.com/terms-of-service\"]");
	By solutions=By.xpath("//ul[@class=\"nav-menu-list\"]//div[@data-hover-content=\"Solutions\"]//a[contains(text(),\"Solutions\")]");
	By live=By.xpath("//ul[@class=\"nav-menu-list\"]//span[contains(text(),\"Live Testing\")]");
	By verify=By.xpath("//h1[@class=\"supertitle \"]");
	By pricing=By.xpath("//ul[@class=\"nav-menu-list\"]//span[contains(text(),\"Pricing\")]");
	By choose=By.xpath("//div[@class=\"link-list\"]//a[@class=\"button is-rounded action-filter\"]");
	By run=By.xpath("//div[@class=\"container\"]//a[contains(text(),\"Run Automated Tests\")]");
	By verify2=By.xpath("//div[@class=\"filter-row is-active\"]//p[2]");
	
	
	@Step
	public void Term() {
		driver.findElement(terms).click();
	}
	@Step
	public void mousehover() {
		WebElement ele=driver.findElement(solutions);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	@Step
	public void Live() {
		driver.findElement(live).click();
	}
	@Step
	public String Verifytext() {
		String str=driver.findElement(verify).getText();
		return str;
	}
	@Step
	public void windowshandel() {
		Set<String>handels=driver.getWindowHandles() ;
		Iterator it=handels.iterator();
		String parent=(String)it.next();
		String child=(String)it.next();
		driver.switchTo().window(child); 
	}
	@Step
	public void price() {
		driver.findElement(pricing).click();
	}
	@Step
	public void chose() {
		driver.findElement(choose).click();
	}
	@Step
	public void Run() {
		driver.findElement(run).click();
	}
	@Step
	public String verifytext() {
		String mte=driver.findElement(verify2).getText();
		return mte;
	}

}
