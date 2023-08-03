package Assignment3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmet3 {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
//		driver.findElement(By.className("dropdown-toggle")).click();
//		
//		System.out.println("1. Print the complete list of text items under the Selenium tab.");
//		
//		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
//		for( WebElement j : element) {
//			System.out.println(j.getText());	
//		}
//		
//		System.out.println("---------------------------------------------------------------------------------------------");
//		System.out.println("2. Print the complete list of text items in the Menu bar (Selenium,Insurance Project , Agile Project etc.");
		//driver.findElement(By.className("dropdown-toggle")).click();
		List<WebElement> element0 = driver.findElements(By.xpath("//div[@id=\"navbar-brand-centered\"]//li[@class=\"dropdown\"]"));
		for( WebElement M : element0) {
			
			if(!(M==null)) {
			System.out.println(M.getText());
		}
//		
//		System.out.println("---------------------------------------------------------------------------------------------");
//		System.out.println("3. Print- SIGN-ON , REGISTER, SUPPORT,CONTACT");
//		List<WebElement> element2 = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr"));
//		for( WebElement j : element2) {
//			System.out.println(j.getText());
//		}
//		
//		System.out.println("---------------------------------------------------------------------------------------------");
//		System.out.println("4. Print the table ");
//		List<WebElement> element3 = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]"));
//		for( WebElement j : element3) {
//			System.out.print(j.getText());
//			System.out.println();
//		}
//		
//		System.out.println("---------------------------------------------------------------------------------------------");
//		System.out.println("5. Print - Testing ,Selenium,Live Project,Java");
//		List<WebElement> element4 = driver.findElements(By.xpath("/html/body/div[1]/div[1]/div[2]/table/tbody"));
//		for( WebElement j : element4) {
//			System.out.println(j.getText());
//		}
//		
//		
//		
//		
//		
		
		
		
		}}

}
