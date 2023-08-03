import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sds {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		for(int i=0; i<25; i++) {
			
			System.out.println(driver.findElement(By.xpath("/span")).getText());
		}
		
		
		
		
		/*for(int i=0; i<100; i++) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"maincounter-wrap\"]/div/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		String elementText = (String) js.executeScript("return arguments[0].textContent;", element);
		System.out.println(elementText);
		}*/
		
		
		
	}

}
