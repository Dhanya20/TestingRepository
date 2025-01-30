package pstudy;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroudction 
{
	public static void main(String[] args)
	{
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.rahulshettyacademy.com");
   System.out.println( driver.getTitle());
   System.out.println( driver.getCurrentUrl());
   driver.close();   
    
    
	}

}
 	