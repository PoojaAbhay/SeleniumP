package Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentExtraQ {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

		
		driver.get("https://demoqa.com/elements");
		driver.navigate().to("https://demoqa.com/elements");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		//Text Box
		
		driver.findElement(By.xpath("//span[@class='text']")).click();
		
		driver.findElement(By.id("userName")).sendKeys("XYZ");
		
		driver.findElement(By.id("userEmail")).sendKeys("XYZ@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("123 XYZ ");
		driver.findElement(By.id("permanentAddress")).sendKeys("11234 XYZ");
		
		WebElement Sub = driver.findElement(By.id("submit"));
		
		System.out.println("Submit button enabled- " + Sub.isEnabled());
		Sub.click();
		
		// Check Box
		
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")).click();
		driver.findElement(By.xpath("//*//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]")).click();
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")).click();
		
		Thread.sleep(3000);
		//Radio Button
		
		driver.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();	
		
		System.out.println(driver.findElement(By.id("noRadio")).isEnabled());
		
		
	
		
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
