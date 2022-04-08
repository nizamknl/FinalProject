package BlazeDemoFP;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BlazeDemo 
{
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\Automation Setup\\Browser Extension\\chromedriver.exe");
      driver=new ChromeDriver();
      Thread.sleep(2000);
      driver.manage().window().maximize();
  }
  
  @Test
  public void BlazeDemo() throws Exception 
  {
	  OCBlazeDemo BD=new OCBlazeDemo();
	  BD.maximizeBrowser(driver);
	  BD.url(driver);
	  BD.departcity(driver);
	  BD.descity(driver);
	  BD.findB(driver);
	  Thread.sleep(2000);
	  
	  BD.choose(driver);
	  Thread.sleep(2000);
	  
	  BD.purchase(driver);
	  Thread.sleep(2000);
	  	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
