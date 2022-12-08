package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement yu=driver.findElement(By.name("q"));
		yu.sendKeys("Youtube");
		yu.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")).click();
		WebElement se =driver.findElement(By.name("search_query"));
		se.click();
		se.sendKeys("Doremon episod 1 in hindi");
		se.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"thumbnail\"]/yt-image/img")).click();
		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[25]/div[2]/div[1]/button")).click();
		// TODO Auto-generated method stub

	}

}
