package webselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
public class Testloginpage {
	@Test	
	public void myTest() {
		System.out.println("welcome to my first automation testing");
		
		System.setProperty("webdriver.chrome.driver", "/home/manjunathachar/chromewebDriver/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
				
        WebElement username = driver.findElement(By.name("standard_user"));
        WebElement password = driver.findElement(By.name("secret_sauce"));
        WebElement loginButton = driver.findElement(By.name("Submit"));
 
        username.clear();
        System.out.println("Entering the UserName");
        username.sendKeys("user1");
 
        password.clear();
        System.out.println("entering the password");
        password.sendKeys("userdsdf1");
 
        System.out.println("Clicking login button");
        loginButton.click();
 
        String successfulloginpagetitle = "Swag Labs";
 
        String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);		
 
        System.out.println("Verifying the page title has started");
        
		Assert.assertEquals(actualTitle,successfulloginpagetitle,"Page title doesnt match. Login Failed");
 
        System.out.println("The page title has been successfully verified");
 
        System.out.println("User logged in successfully");

	}	
}
