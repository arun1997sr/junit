package org.flip;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	static WebDriver driver;
	static long starttime ;
	@BeforeClass
	public static void launchBrowser() {
		System.out.println("beforeclass");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void mobile() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(3000);
		

	}
	
	@AfterClass
	public static void close() throws IOException {
		System.out.println("hi");
		TakesScreenshot ss=(TakesScreenshot) driver;
		File sourse=ss.getScreenshotAs(OutputType.FILE);
		File Target=new File("C:\\Users\\hp\\eclipse-workspace\\junit\\target\\screenShot.png");
		FileUtils.copyFile(sourse, Target);
		System.out.println("hiiiiiiiiiiiiiiiiii");

		//	driver.close();
	}
	@Before
	public void beforemethod() {
		System.out.println("beforemethod");
		 starttime = System.currentTimeMillis();

	}
	@After
	public void aftermethod() {
		System.out.println("aftermethod");
		long endtime = System.currentTimeMillis();
		long time=endtime-starttime;
		System.out.println(time);

	}

}
