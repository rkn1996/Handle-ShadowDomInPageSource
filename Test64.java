package stevejobssir;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test64
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame("pact");
		//target Element is inside a single shadow DOM
		WebElement shadowHostElement=driver.findElement(By.id("snacktime"));
		SearchContext shadowRootElement=shadowHostElement.getShadowRoot();
		WebElement targetElement=shadowRootElement.findElement(By.className("food"));
		try
		{
			targetElement.click();
		}
		catch(Exception ex)
		{
			driver.executeScript("arguments[0].click();", targetElement);
		}
		//no separate code for exit from Shadow DOM, directly automate elements in rest of the page
	}
}
