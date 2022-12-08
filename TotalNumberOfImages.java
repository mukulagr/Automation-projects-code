package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumberOfImages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.1viewtask.com/Dashboard/eagleview");
		Thread.sleep(3000);
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.print("total number of images :"+images.size());
		//driver.quit();
		
	}

}

