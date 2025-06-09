package directlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.findElement(By.name("search")).sendKeys("Macbook");
		WebElement logo=driver.findElement(By.id("logo"));
		boolean status=logo.isDisplayed();
		System.out.println("Display status:"+status);
		driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Tab"));
	}

}
