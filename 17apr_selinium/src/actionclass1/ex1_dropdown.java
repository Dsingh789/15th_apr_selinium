package actionclass1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_dropdown
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		WebElement alloption=driver.findElement(By.xpath("//a[@class=\"dropdown-toggle meganav-shop\"]"));
		//step2
		Actions act=new Actions(driver);
		act.moveToElement(alloption).perform();
		//step2
		Thread.sleep(2000);
		WebElement beverage=driver.findElement(By.xpath("(//a[@ng-href=\"/cl/beverages/?nc=nb\"])[2]"));
		//move cursur
		Actions act1=new Actions(driver);
		act1.moveToElement(beverage).perform();
		// click & hold on elements
		Thread.sleep(2000);
		WebElement coffee=driver.findElement(By.xpath("(//a[text()='Coffee'])[2]"));
		Actions act2=new Actions(driver);
		act2.clickAndHold(coffee).perform();
		Thread.sleep(2000);
		//move cursur and left click
		WebElement instantcoffee=driver.findElement(By.xpath("(//a[text()='Instant Coffee'])[2]"));
		Actions act3=new Actions(driver);
		act3.moveToElement(instantcoffee).click().perform();
		//select brand
		Thread.sleep(2000);
		WebElement brand =driver.findElement(By.xpath("(//span[text()='Brand'])[1]"));
		Actions act4=new Actions(driver);
		act4.moveToElement(brand).perform();
		//
		Thread.sleep(2000);
		//WebElement checkbox=driver.findElement(By.xpath("(//div[@class=\"col-xs-12 checkbox ng-scope\"])"));
		//Actions act5=new Actions(driver);
		//act5.click(checkbox).perform();
		//List<WebElement>checkbox=driver.findElements(By.xpath("(//div[@class=\"col-xs-12 checkbox ng-scope\"])"));
		List<WebElement>checkbox=driver.findElements(By.xpath("//i[@class=\"cr-icon fa fa-check\"]"));
		for(WebElement s1:checkbox)
		{
			s1.click();
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
			
		}
		
		
		
		
		
		
		
		
		
	}

}
