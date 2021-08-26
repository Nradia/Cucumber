package RadiaTech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverTest {

	
	public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\ProjectsPractice\\MyTstNGproject\\Drivers\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\radia\\eclipse-workspace\\siamFramework\\Drivers\\geckodriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://airbnb.com");
	WebElement location=driver.findElement(By.xpath("//input=[@id='bigsearch-query-detached-query-input"));
	location.sendKeys("miami");
	WebElement loc=driver.findElement(By.xpath("//input[@value='Miami, FL]"));
	loc.click();
	
	
}//
}