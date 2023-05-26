package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_maximize 
{
	public static void main(String[] args)
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://nalandauniv.edu.in/");
		d1.manage().window().maximize();
		
	}

}
