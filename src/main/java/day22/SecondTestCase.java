package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTestCase {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("the number of links is : "+links.size());
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("The number of images is : "+images.size());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s6")));
		product.click();

		driver.close();

	}

}
