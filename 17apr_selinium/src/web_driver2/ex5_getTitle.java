package web_driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_getTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://nalandauniv.edu.in/");
		Thread.sleep(3000);
		String title=d1.getTitle();
		System.out.println(title);
		
		
	}

}
