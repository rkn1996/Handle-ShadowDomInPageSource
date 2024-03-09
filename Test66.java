package stevejobssir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test66
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site and close banner
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		try
		{
			driver.findElement(By.xpath("//img[@title='Close']")).click();
		}
		catch(Exception ex)
		{
			System.out.println("No banner");
		}
		Thread.sleep(5000);
		//target Element is inside a single shadow DOM(closed)
		WebElement shadowHostElement=driver.findElement(By.id("userPass"));
		shadowHostElement.click(); //get focus to shadow host element
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB,"kalam").perform();//indirect automation of element using keyboard
		Thread.sleep(5000);
		//no separate code for exit from Shadow DOM, directly automate elements in rest of the page
	}
}
