package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ShopsyPage extends BaseMethods {
	
	public ShopsyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
			
	@FindBy (xpath="(//i[@class='icon-search'])[1]	")	
	WebElement search;

public void shopSearch() {
	 search.click();
}
	
	@FindBy(xpath="(//input[@type='search' and @placeholder='Search…'])[1]")
	WebElement item;
	
	public void searchItem() {
		item.sendKeys("laptop",Keys.ENTER);
		
	}
}

