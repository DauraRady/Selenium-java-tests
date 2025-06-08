package day21;

//import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		/*WebElement element=driver.findElement(By.xpath("//label[@class='cb-lb']/input[@type='checkbox']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement checkbox=wait.until(ExpectedConditions.elementToBeClickable(element));
		checkbox.click();*/
		
		String actual_title=driver.getTitle();
		if(actual_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else{
			System.out.println("Test Failed");
		}
	}

}
