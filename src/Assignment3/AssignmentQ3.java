package Assignment3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentQ3 {

	public static void main(String[] args) {
		
			System.out.println("3. Print SIGN-ON , REGISTER, SUPPORT,CONTACT");

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			

			
			driver.get("https://demo.guru99.com/test/newtours/index.php");
			driver.manage().window().maximize();
			
		
			List<WebElement> element = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr"));
			
			for( WebElement j : element) {
				
				System.out.println(j.getText());
				
			}
		
	}

}
