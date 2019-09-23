package org.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\workspace\\Demo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.eurowings.com");
		WebElement from=driver.findElement(By.id("gid-autocomplete-1-input"));
		from.sendKeys("london");
		WebElement to=driver.findElement(By.id("gid-autocomplete-2-input"));
		to.sendKeys("New York");
		Thread.sleep(3000);
		WebElement da=driver.findElement(By.cssSelector("input[id='gid-mask-1-input']"));
		da.sendKeys("10/02/19");
		WebElement oneway=driver.findElement(By.xpath("(//div[@class='m-form-radiobutton__input'])[2]"));
		oneway.click();
		WebElement search=driver.findElement(By.xpath("//button[@class='a-cta a-cta--block a-cta-prio1']"));
		search.click();
		Thread.sleep(3000);
		WebElement se=driver.findElement(By.xpath("(//tr[@class='m-ibe-flighttable__item'])[1]"));
		se.click();
		WebElement basic=driver.findElement(By.xpath("(//button[@class='m-ibe-flighttariff__select'])[1]"));
		basic.click();
		WebElement con1=driver.findElement(By.xpath("(//button[@class='a-cta a-cta-prio1'])[2]"));
		con1.click();
		WebElement seat=driver.findElement(By.xpath("//button[@class='a-cta a-cta--block a-cta-prio1']"));
		seat.click();
		WebElement Seat1=driver.findElement(By.xpath("(//button[@class='o-ibe-seatmap-selection__input'])[70]"));
		Seat1.click();
		WebElement save=driver.findElement(By.xpath("//button[@title='Save and continue']"));
		save.click();
		WebElement save1 = driver.findElement(By.xpath("(//button[@class='a-cta a-cta-prio1'])[1]"));
		save1.click();
		WebElement con3=driver.findElement(By.xpath("(//button[@class='a-cta a-cta-prio1'])[1]"));
		con3.click();
		WebElement 	tit=driver.findElement(By.xpath("//select[@id='form-field-y2rwrju53y']"));
		Select s=new Select(tit);
		s.selectByVisibleText("Mr");
		WebElement 	name=driver.findElement(By.xpath("//input[@id='form-field-6rsqmduuxcw']"));
		name.sendKeys("suresh");
		WebElement 	name2=driver.findElement(By.xpath("//input[@id='form-field-d4afvttq2p']"));
		name2.sendKeys("d");
		WebElement 	dob=driver.findElement(By.xpath("//input[@id='form-field-0aq2k9lr8m1r-input']"));
		dob.sendKeys("11/03/1991");
		WebElement 	con4=driver.findElement(By.xpath("(//button[@class='a-cta a-cta-prio1'])[1]"));
		con4.click();
		WebElement 	pay=driver.findElement(By.xpath("(//button[@class='a-cta a-cta-prio1'])[1]"));
		pay.click();		
		}
}