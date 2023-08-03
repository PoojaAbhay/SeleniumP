import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		/*WebElement UI = driver.findElement(By.id("textbox1"));
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.id("pah")).getText());*/
		
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		
		
		driver.quit();*/

	}

}
