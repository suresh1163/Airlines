package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirLines {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Java\\workspace\\Demo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skytrans.com.au/");
	
}
}