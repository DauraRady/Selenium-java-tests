package test.booking.search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingSearchTest {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement destinationField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Où allez-vous ?']")));
		destinationField.click();

		destinationField.sendKeys("Lyon");

		WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Lyon')]")));

		
		suggestion.click();
		//driver.findElement(By.cssSelector("button[aria-label='Ignorer les infos relatives à la connexion']")).click();
	
		WebElement DateArrival=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-date='2025-07-09']")));
		DateArrival.click();
		WebElement DateDeparture=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-date='2025-07-10']")));
		DateDeparture.click();
		driver.findElement(By.cssSelector("button[data-testid='searchbox-dates-container']")).click();
		driver.findElement(By.cssSelector("button[data-testid='occupancy-config']")).click();
		WebElement MinusBtnAdults = driver.findElement(
			    By.xpath("//label[contains(text(),'Adultes')]/following::button[1]")
			);
		MinusBtnAdults.click();
		WebElement toggleLabel = driver.findElement(By.cssSelector("label[for='pets']"));
		toggleLabel.click();
		WebElement submitBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[span[normalize-space()='Terminer']]")));
		submitBtn.click();
		WebElement searchBtn=driver.findElement(By.xpath("//button[.//span[text()='Rechercher']]"));
		searchBtn.click();
		driver.close();


		
	}

}
