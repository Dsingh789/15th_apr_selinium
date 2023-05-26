package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_close
{
	public static void main(String[] args)
	{
		WebDriver b1=new ChromeDriver();
		b1.get("https://www.rgpv.ac.in/");
		b1.close();
	}

}
