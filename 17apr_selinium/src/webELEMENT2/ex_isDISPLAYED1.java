package webELEMENT2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.state.SynchronousMetricStorage;

public class ex_isDISPLAYED1
{
  public static void main(String[] args) throws InterruptedException
  {
	  // goto website
	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/?");
	  //logo present or not trhen use //isDisplayed
	  
	 boolean result=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
	  System.out.println(result);
	  //slect tab enabled or disable /// isselected
	  boolean result1=driver.findElement(By.xpath("//input[@name='field-keywords']")).isEnabled();
	  System.out.println(result1);
	  
	  if(result1)
	  {
		  System.out.println("tab is enabled");
	  }
	  else
	  { 
		  System.out.println("tab is disabled");
	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Samsung Galaxy M14 5G");
	  //search on tab
	  driver.findElement(By.xpath("//input[@value='Go']")).click();
	  Thread.sleep(2000);
	  //select product
	  driver.findElement(By.xpath("//img[@data-image-latency='s-product-image'][1]")).click();
	  //add to cart product
	 Thread.sleep(5000);
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/Samsung-Storage-Battery-Octa-Core-Processor/dp/B0BZCR6TNK/ref=sr_1_1_sspa?keywords=Samsung%2BGalaxy%2BM14%2B5G&qid=1683567633&sr=8-1-spons&sp_csd=d2lkZ2V0T");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@value='Add to Cart']")).click(); 
	 driver.close();
	  
}

}


