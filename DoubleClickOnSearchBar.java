package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOnSearchBar {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement s= driver.findElement(By.name("q"));
		//s.sendKeys("Kodnest");
		Actions act= new Actions(driver);
		//act.sendKeys(s, "Kodnest").doubleClick().build().perform();
		//act.contextClick().build().perform();
		act.moveToElement(s)
		.keyDown(Keys.SHIFT)
		.sendKeys("KODNEST")
		.sendKeys(Keys.SPACE)
		.sendKeys("Technology")
		.keyUp(Keys.SHIFT)
		.sendKeys(Keys.SPACE)
		.sendKeys("banglore")
		.sendKeys(Keys.SPACE)
		.build().perform();
		s.submit();
		WebElement li = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[1]/div/a/h3"));
		li.click();
		WebElement check_sy= driver.findElement(By.xpath("//*[@id=\"post-36481\"]/div/div/div/div/section[1]/div/div/div/div/div/section/div/div/div[1]/div/div/div/div/a/div[1]/div[2]/span"));
		check_sy.click();
		
		// TODO Auto-generated method stub

	}

}
