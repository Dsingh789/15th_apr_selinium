package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_minimize 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://nalandauniv.edu.in/");
		d1.manage().window().maximize();
		Thread.sleep(3000);
		d1.manage().window().minimize();
		
	}

}
