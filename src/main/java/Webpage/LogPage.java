package Webpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogPage {

	public static void main(String[] args) throws Throwable {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@title='Enter email / mobile number']")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.xpath("//input[@title='Please enter your password']")).sendKeys("ZPMHQHIA");
		
		driver.findElement(By.xpath("//button[@class='btn green_btn']")).click();
		
		Thread.sleep(2000);
	
	
		driver.findElement(By.xpath("//a[@href='/Authenticate/Logout']/ancestor-or-self::li")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/Authenticate/Logout']")).click();
	}

}
