package testcase;



import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import io.qameta.allure.Step;
import lab.Button;
import lab.Enivornment;
import lab.Resources;
import lab.Terms;
import lab.locatorlogin;
@Listeners({listners.Listners.class})

public class TestCase extends BaseClass{
	public WebDriver driver;
	Terms ter;
	Enivornment env;
	Resources source;
	Button brk;
	locatorlogin login;
	BaseClass base;
	
	
	
	@BeforeClass
	public void Aobjects() {
		base=new BaseClass();
		driver=base.initialize_driver();
		login=new locatorlogin(driver);
		brk=new Button(driver);
		source=new Resources(driver);
		env =new Enivornment(driver);
		ter=new Terms(driver);
		
		
		
	}
	@Test(description="Login page")
	@Step("User try to login the page")
	public void Btestloginpage() {
		login.Trigger_url("https://www.saucedemo.com/");
		login.getuserid();
		login.password();
		login.loginButton();
		//Assert.assertEquals(login.url(), "https://www.saucedemo.com/inventory.html");
		System.out.println("url verified");
	}
	@Test(description="Clicking on main functionality")
	@Step("Clicking on main functionality")
	public void Ctestbutton() {
		brk.ton();
		brk.aboutbutton();
		brk.platformhover();
		brk.clickintegration();
		System.out.println(brk.verifytext());
		
	}
	@Test(description="Clicking on Resources")
	@Step("Clicking on Resources")
	public void Dresources() throws InterruptedException {
		source.resour();
		source.Traning();
		
		source.scroll();
		Thread.sleep(5000);
		source.cook();
		
		Set<String>handels=driver.getWindowHandles() ;
		Iterator it=handels.iterator();
		String parent=(String)it.next();
		String child=(String)it.next();
		driver.switchTo().window(child); 
		source.Buttom();
		
		Assert.assertEquals(source.verifytext(), "Security at Sauce Labs");
	}
	@Test(description="Clicking on Enivronment variable")
	@Step("Clicking on Enivronment variable")
	public void Environmentvaribale() throws InterruptedException {
		env.enivronment();
		env.windowhandel();
		env.uandp();
		//Assert.assertEquals(env.Verify1(),"Sauce Labs");
		//env.scroll();
		Thread.sleep(6000);
	    env.Tryfor();
	   // Assert.assertEquals(env.Verify2(), "Start your free trial today. No credit card required.");
	}
	@Test(description="terms_and_condition")
	@Step("terms_and_condition")
	public void termsandcondition(){
		ter.Term();
		ter.windowshandel();
		ter.mousehover();
		ter.Live();
		Assert.assertEquals(ter.Verifytext(), "MANUAL TESTING");
		ter.price();
		ter.chose();
		ter.Run();
		Assert.assertEquals(ter.verifytext(),"I want to test..." );
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	

}
