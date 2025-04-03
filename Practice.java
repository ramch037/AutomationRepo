package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("https://omayo.blogspot.com/");
		
//		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Check this')]"));
//		button.click();
//		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
//		checkbox.click();
//		boolean clicked = checkbox.isSelected();
//		System.out.println("The checkbox is selected "+clicked);
		
		
//		driver.findElement(By.id("alert1")).click();
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println("Text on alert is \""+alert.getText()+"\"");
//		alert.dismiss();
//		
//		WebElement text = driver.findElement(By.id("pah"));
//		System.out.println(text.getText());
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchBoxElement = driver.findElement(By.id("twotabsearchtextbox"));
		searchBoxElement.click();
		searchBoxElement.sendKeys("l");
		String suggestions = "//div[contains(@id,'sac-suggestion-row')]//div[contains(@aria-label,'l')]";
		
		List<WebElement> suggestionListElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(suggestions)));
		for(WebElement suggestionlistElement: suggestionListElements) {
			String item = suggestionlistElement.getText();
//			System.out.println(item);
			if(item.contains("lunch box")) {
				suggestionlistElement.click();
				break;
			}
			
		}
		List<WebElement> productCardsElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@role='listitem']//h2[@aria-label]/span")));
		for(WebElement productCardElement: productCardsElements) {
			String productName = productCardElement.getText();
			System.out.println(productName);
			if(productName.contains("Magnus Olive-3")) {
				productCardElement.click();
				break;
			}
		}
		
		
		
		
	}

}
