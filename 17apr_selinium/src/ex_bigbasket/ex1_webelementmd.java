package ex_bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_webelementmd
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		//md1-->toget title
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		//getcurrent url
		System.out.println("--------getcurrenturl----");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//use navigation
		driver.navigate().refresh();
		//usingabs xpath for offer
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();
		//select any product
		driver.findElement(By.xpath("/div[3]/a/img")).click();
		
		
		
		
		
		
		
	}

}
