package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_quit2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		d1.get("https://nalandauniv.edu.in/");
		Thread.sleep(3000);
		d1.quit();
	}

}
