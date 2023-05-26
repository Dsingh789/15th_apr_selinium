package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_quit 
{
	public static void main(String[] args) 
	{
		WebDriver b5=new ChromeDriver();
		b5.get("https://www.rgpv.ac.in/");
		b5.get("https://www.flipkart.com/");
		
		b5.quit();
	}

}
