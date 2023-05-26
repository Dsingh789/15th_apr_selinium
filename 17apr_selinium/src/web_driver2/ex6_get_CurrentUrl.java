package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_get_CurrentUrl
{
	public static void main(String[] args)
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://nalandauniv.edu.in/");
		String url=d1.getCurrentUrl();
		System.out.println(url);
	}

}
