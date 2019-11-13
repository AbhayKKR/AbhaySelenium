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

public class ELTC_003 {
	
	WebDriver driver;
    @BeforeMethod
    public void BeforeTest()
    {
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "//drivers/geckodriver.exe"); 
	
    driver = new FirefoxDriver();
    }

    @Test
	public void register1 ()
	
	{
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://elearningm1.upskills.in");
		
		driver.findElement(By.id("login")).sendKeys("AbhayTest");
		driver.findElement(By.id("password")).sendKeys("Manipal@1");
		driver.findElement(By.id("form-login_submitAuth")).click();
		driver.findElement(By.xpath("//*[@id='profileCollapse']/div/ul/li[5]/a")).click();
		driver.findElement(By.id("profile_password0")).sendKeys("Manipal@1");
		driver.findElement(By.id("password1")).sendKeys("Manipal@2");
		driver.findElement(By.name("password2")).sendKeys("Manipal@2");
		driver.findElement(By.id("extra_skype")).sendKeys("SkypeManipalTest");
		driver.findElement(By.id("profile_apply_change")).click();
		
			

	}}


