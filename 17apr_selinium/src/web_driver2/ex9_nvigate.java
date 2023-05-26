package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex9_nvigate
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d1=new ChromeDriver();
		d1.navigate().to("https://nalandauniv.edu.in/");
		d1.navigate().forward();
		d1.navigate().to("https://www.google.co.in/");
		Thread.sleep(5000);
		d1.navigate().back();
		d1.navigate().refresh();
		d1.quit();
		
	}

}
