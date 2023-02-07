package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Step;

public class Contact {
	WebDriver driver;
	public  Contact(WebDriver driver) {
		this.driver=driver;
	}
	By contact=By.xpath("//ul[@class=\"nav-menu-list\"]//a[contains(text(),\"Contact\")]");
	By contactsales=By.xpath("//ul[@class=\"nav-menu-list\"]//span[contains(text(),\"Contact Sales\")]");
	By firstname=By.xpath("//input[@id=\"FirstName\"]");
	By lastname=By.xpath("//input[@id=\"LastName\"]");
	By email=By.id("id=\"Email\"");
	By companysize=By.id("id=\"Company_Size__c\"");
	By country=By.id("id=\"Country\"");
	By phone=By.id("id=\"Phone\"");
	By mobilecheckbook=By.xpath("//input[@id=\"mktoCheckbox_32744_1\"]");
	
	
	
	
	@Step
	public void contact1() {
		WebElement ele=driver.findElement(contact);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	@Step
	public void sales() {
		driver.findElement(contactsales).click();
	}
	@Step
	public void name() {
		driver.findElement(firstname).sendKeys("Sourabh");
		driver.findElement(lastname).sendKeys("Jha");
		driver.findElement(email).sendKeys("saurav@gmail.com");
	}
	@Step
	public void dropdown1() {
		WebElement elt=driver.findElement(companysize);
		Select slt=new Select(elt);
		slt.selectByValue("11-50");
	}
	@Step
	public void dropdown2() {
		WebElement kha=driver.findElement(country);
		Select stl=new Select(kha);
		stl.selectByValue("India");
	}
	@Step
	public void Phone() {
		driver.findElement(phone).sendKeys("9205971415");
	}
	

}
