package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {
	
   public  WebDriver driver;
	public WebDriver get() {
		  if (driver == null) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	        }
	        return driver;
	    }

	    public void launchWeb() {
	        driver.get("http://www.meesho.com/");
	    }
	    public void shopsyweb() {
	    	driver.get("https://www.shopsy.co.in/");
	    }
	public void exist() {
		driver.quit();
	}
	public void time() throws InterruptedException {
		Thread.sleep(5000);
	}

}
