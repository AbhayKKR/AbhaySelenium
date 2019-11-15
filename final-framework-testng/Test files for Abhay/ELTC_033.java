package simple;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class ELTC_033 {

	
		WebDriver driver;
	    @BeforeMethod
	    public void Beforete()
	    {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "//drivers/geckodriver.exe"); 
		
	    driver = new FirefoxDriver();
	    }
		@Test	
			public void register () throws IOException, InterruptedException {

						
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://elearningm1.upskills.in");
			driver.findElement(By.id("login")).sendKeys("adminteacher");
			driver.findElement(By.id("password" )).sendKeys("admin@123");
			driver.findElement(By.id("form-login_submitAuth")).click();
//			driver.findElement(By.xpath("\"//button[text() ='Login']\"")).click();	
			driver.findElement(By.linkText("My courses")).click();
			driver.findElement(By.linkText("Testcourse11")).click();
			driver.findElement(By.id("istooldesc_8318")).click();
			driver.findElement(By.xpath("//div[@id='gradebook-actions']//div[1]/a[2]/img")).click();
			driver.findElement(By.xpath("//*[@id='create_link']/fieldset/div/div[1]/div//span/span")).click();
			driver.findElement(By.xpath("//*[@id='create_link']/fieldset/div/div[1]/div/div/div[2]/ul/li[2]/a/span")).click();
			driver.findElement(By.id("weight_mask")).sendKeys("10");
			driver.findElement(By.id("add_link_submit")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id='gradebook_list']/tbody/tr[2]/td[3]/a")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id='gradebook_list']/tbody/tr[2]/td[5]/p")).getText());
//			driver.findElement(By.xpath("//*[@id='gradebook_list']/tbody/tr[2]/td[6]/a[1]/img")).click();
//			System.out.println("Page title: "  + driver.findElement(By.xpath("//*[@id='edit_link_form']/fieldset/legend")).getText());
//			assertEquals( driver.findElement(By.xpath("//*[@id='edit_link_form']/fieldset/legend")).getText(),"Edit link");	
//
//			TakesScreenshot takeScreenShot  = (TakesScreenshot) driver; 
//			File file = takeScreenShot.getScreenshotAs(OutputType.FILE);
//			
//			FileUtils.copyFile(file, new File("C:\\Users\\ABHAYKURKURE\\Desktop\\Manipal\\SSrunresult\\firstfile3"));
			
			driver.findElement(By.xpath("//*[@id='gradebook-actions']/div/div[2]/a[1]")).click();		
			
			TakesScreenshot takeScreenShot  = (TakesScreenshot) driver; 
			File file = takeScreenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\ABHAYKURKURE\\Desktop\\Manipal\\SSrunresult\\firstfile1"));
			
			driver.findElement(By.id("edit_cat_form_description")).sendKeys("new comment1");
			
			driver.findElement(By.xpath("//*[@id='generate_certificates']/label")).click();
			
			driver.findElement(By.id("edit_cat_form_submit")).click();
			driver.findElement(By.xpath("//*[@id='cm-content']/div/div[3]/div/div")).getText();
			assertEquals( driver.findElement(By.xpath("//*[@id='cm-content']/div/div[3]/div/div")).getText(),"Category updated");
			
//			takeScreenShot=   (TakesScreenshot) driver.FileUtils.copyFile(file, new File("C:\\Users\\ABHAYKURKURE\\Desktop\\Manipal\\SSrunresult\\firstfile2"));
//			
			TakesScreenshot takeScreenShot1  = (TakesScreenshot) driver; 
			File file1 = takeScreenShot1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\ABHAYKURKURE\\Desktop\\Manipal\\SSrunresult\\firstfile2"));
		   
			driver.findElement(By.xpath("//*[@id='gradebook-actions']/div/div[2]/a[2]/img")).click();
			
//			System.out.println(driver.findElement(By.xpath("//*[@id='gradebook-actions']/div/div[2]/a[2]/img\")).getText();
			
			System.out.println(driver.findElement(By.xpath("//*[@id='gradebook-actions']/div/div[2]/a[2]/img\\")).getText());
		
			
			TakesScreenshot takeScreenShot2  = (TakesScreenshot) driver; 
			File file2 = takeScreenShot1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file2, new File("C:\\Users\\ABHAYKURKURE\\Desktop\\Manipal\\SSrunresult\\firstfile3"));
			
//			System.out.println(driver.findElement(By.xpath("//*[@id='teacher_table5dcea2ee76b14']/tbody/tr[2]/td[2]/a[1]")).getText());
			
			System.out.println(driver.findElement(By.linkText("Default certificate")).getText());
		
			Thread.sleep(1000);
			TakesScreenshot takeScreenShot3  = (TakesScreenshot) driver; 
			File file3 = takeScreenShot1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file3, new File("C:\\Users\\ABHAYKURKURE\\Desktop\\Manipal\\SSrunresult\\firstfile4"));
			
	
		}
		

}


