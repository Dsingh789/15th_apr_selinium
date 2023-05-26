package ex_bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2webelement 
{
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		//check logo
		boolean result=driver.findElement(By.xpath("//a[@title='Bigbasket']")).isDisplayed();
		System.out.println(result);
		//offer
		boolean result1=driver.findElement(By.xpath("//a[@role='button']")).isEnabled();
		System.out.println(result1);
		//gettitle
		String value=driver.getTitle();
		System.out.println(value);
		//send keys search
		WebElement un=driver.findElement(By.xpath("//button[@class='btn btn-default bb-search']"));
		un.sendKeys("colgate");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
