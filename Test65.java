package stevejobssir;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test65
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("chrome://settings/");
		Thread.sleep(5000);
		//target Element is inside a nested shadow DOM
		WebElement shost1=driver.findElement(By.tagName("settings-ui"));
		SearchContext root1=shost1.getShadowRoot();
		WebElement shost2=root1.findElement(By.id("toolbar"));
		SearchContext root2=shost2.getShadowRoot();
		WebElement shost3=root2.findElement(By.id("search"));
		SearchContext root3=shost3.getShadowRoot();
		root3.findElement(By.id("searchInput")).sendKeys("abdul kalam sir");
	}
}
