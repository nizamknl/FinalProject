package BlazeDemoFP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OCBlazeDemo 
{
	Select s;
	
	public void maximizeBrowser(WebDriver driver) throws Exception
	{
		driver.manage().window().maximize();
	}
	
	public void url(WebDriver driver)
	{
		driver.get("https://blazedemo.com/");
	}
	
	public void departcity(WebDriver driver) throws InterruptedException
	{
		
		s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		s.selectByIndex(5);
		Thread.sleep(2000);
	
	}
	
	public void descity(WebDriver driver) throws InterruptedException
	{
		s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		s.selectByVisibleText("Berlin");
		Thread.sleep(2000);
		
	}
	
	public void findB(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
	}
	
	public void choose(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
		Thread.sleep(2000);
	}
	
	public void purchase(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div/input")).sendKeys("Nizam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div/input")).sendKeys("Kurnool");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div/input")).sendKeys("Kurnool");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[4]/div/input")).sendKeys("AP");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[5]/div/input")).sendKeys("518003");
		Thread.sleep(2000);
		
		s=new Select(driver.findElement(By.xpath("/html/body/div[2]/form/div[6]/div/select")));
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[7]/div/input")).sendKeys("3456789234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[8]/div/input")).sendKeys("11");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[9]/div/input")).sendKeys("2034");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[10]/div/input")).sendKeys("Nizam");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/label/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		
	}
		
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}

}
