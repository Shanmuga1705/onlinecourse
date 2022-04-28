package automationProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/jshan/Dropbox/PC/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shanmuga");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shanmuga@rsa.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//indexing child with xpath
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");//indexing child with CSS
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253"); //parent to child xpath
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//class CSS locator
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //parent to child CSS
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Vignesh");//CSS locator for ID
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");  //regular expression with CSS
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); //regular expression with Xpath
	}
}
