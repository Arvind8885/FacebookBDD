package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FBDataDriverTesting {
	WebDriver driver;
	
		@Given("user on facebook site")
		public void user_on_facebook_site() {
			driver = new ChromeDriver();
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			driver.get("https://www.facebook.com/reg");
			
		}
		@When("user add {string} and {string} and {string} and {string}")
		public void user_add_and_and_and(String firstName, String lastName, String mobileNumber, String password) {
			driver.findElement(By.name("firstname")).sendKeys(firstName);
			driver.findElement(By.name("lastname")).sendKeys(lastName);
			driver.findElement(By.name("reg_email__")).sendKeys(mobileNumber);
			driver.findElement(By.name("reg_passwd__")).sendKeys(password);
			 
			
			driver.quit();
		
		
	}

}
