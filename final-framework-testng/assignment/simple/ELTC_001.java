package simple;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.Driver;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ELTC_001 
{ 
	WebDriver driver;
    @BeforeMethod
    public void BeforeTest()
    {
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "//drivers/geckodriver.exe"); 
	
    driver = new FirefoxDriver();
    }
	@Test	
		public void register () {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://elearningm1.upskills.in");
		driver.findElement(By.linkText("Sign up!")).click();
		driver.findElement(By.id("registration_firstname")).sendKeys("Abhay3");
		driver.findElement(By.id("registration_lastname")).sendKeys("KKR3");
		driver.findElement(By.id("registration_email")).sendKeys("testkabhay@gmail.com");
		driver.findElement(By.id("username")).sendKeys("AbhayTest3");
		driver.findElement(By.id("pass1" )).sendKeys("reva123");
		driver.findElement(By.id("pass2")).sendKeys("reva123");
		driver.findElement(By.id("registration_submit")).click();
		driver.findElement(By.id("registration_phone")).sendKeys("9876455463");
		driver.findElement(By.id("registration_submit")).click();
		

     }
     }
	
		
		

		