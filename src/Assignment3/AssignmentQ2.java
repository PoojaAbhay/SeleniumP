package Assignment3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentQ2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("2. Print the complete list of text items in the Menu bar (Selenium,Insurance Project , Agile Project etc.");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String path = "(//div[@id=\\\"LinkList1\\\"]//a)";
		
		driver.get("https://economictimes.indiatimes.com/?from=mdr");
		driver.manage().window().maximize();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@class=\"tabsView tabVertical\"]//ul//li"));
		
		
		for (int i = 1; i <= element.size(); i++) {
			
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("//div[@class=\"tabsView tabVertical\"]//ul//li"+"["+i+"]")).click();
			driver.navigate().back();
			
		}
			
			
			
		
		
		

	}

}
