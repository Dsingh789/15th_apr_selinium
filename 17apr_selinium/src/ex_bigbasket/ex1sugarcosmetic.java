package ex_bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1sugarcosmetic
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	 driver.get("https://in.sugarcosmetics.com/");
     driver.findElement(By.cssSelector("#__next > div > div.d-none.d-md-block > div:nth-child(1) > div > div > div.d-flex.py-3 > div.col-2.d-flex.justify-content-center > a > div > svg > path"));
}
}