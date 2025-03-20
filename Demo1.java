package outside;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String mainWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Blogger']")).click();
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();

		Set<String> windowsOpen = driver.getWindowHandles();
		for(String window: windowsOpen) {
			driver.switchTo().window(window);
			if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily.")) {
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(10000);
		driver.close();
		for(String window: windowsOpen) {
			driver.switchTo().window(window);
			if(driver.getTitle().equals("New Window")) {
				break;
			}
		}
		String text = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(text);
		Thread.sleep(10000);
		driver.close();
		
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("Ramakrishna");

	}

}
