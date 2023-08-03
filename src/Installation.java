import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Installation {

	public static void main(String[] args) throws InterruptedException {
	
		String browser = "Chrome";
		
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		}
		else {
			
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		 
	}
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		
List<WebElement> element0 = driver.findElements(By.xpath("//*[@id=\"navbar-brand-centered\"]"));
		
		for( WebElement j : element0) {
			
			System.out.println(j.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				}

}
