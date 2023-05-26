package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_get
{
	public static void main(String[] args)
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.rgpv.ac.in/");
		
	}

}
