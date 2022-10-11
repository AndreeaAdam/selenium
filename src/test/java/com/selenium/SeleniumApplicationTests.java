package com.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SeleniumApplicationTests {
	WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Test
	public void test2holidayreq() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thecon\\Downloads\\chromedriver_win32\\chromedriver1.exe");
		ChromeDriver driver;
		driver = new ChromeDriver();
		js = driver;
		vars = new HashMap<>();
		driver.get("http://app.thecon.ro/days-off/add");
		driver.findElement(By.name("type")).click();
		{
			WebElement dropdown = driver.findElement(By.name("type"));
			dropdown.findElement(By.xpath("//option[. = 'Sick leave']")).click();
		}
		driver.findElement(By.name("reason")).click();
		driver.findElement(By.name("reason")).sendKeys("test test test");
		driver.findElement(By.name("myDateRange")).click();
		driver.findElement(By.id("d_3_2")).click();
		driver.findElement(By.id("d_3_2")).click();
		driver.findElement(By.cssSelector(".btn-green")).click();
		driver.quit();
	}

}
