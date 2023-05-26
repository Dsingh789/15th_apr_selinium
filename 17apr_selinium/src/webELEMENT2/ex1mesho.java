package webELEMENT2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1mesho
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.meesho.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"NavBarDesktop__Subtitle-sc-xsryom-0 izctWK\"][1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[2]/div/div[2]/a[3]")).click();
		
		
		
		
	}

}
