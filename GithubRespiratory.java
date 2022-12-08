package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubRespiratory {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement se =  driver.findElement(By.name("q"));
		se.sendKeys("Git hub");
		se.sendKeys(Keys.ENTER);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
		link.click();
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		Thread.sleep(2000);
		WebElement create = driver.findElement(By.xpath("//*[@id=\"login\"]/p/a"));
		create.click();
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[4]/main/div[2]/text-suggester/div[1]/form/div[1]/div[2]/div/auto-check/input[1]"));
		email.sendKeys(Keys.ENTER);
		
		// TODO Auto-generated method stub

	}

}
