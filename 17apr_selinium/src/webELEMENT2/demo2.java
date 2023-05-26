package webELEMENT2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series");
		Thread.sleep(2000);
		boolean result=driver.findElement(By.xpath("//img[@width=\'138\']")).isEnabled();
		System.out.println(result);
	}

}
