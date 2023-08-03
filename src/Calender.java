import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("01/15/2027");
		String text = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();

		String month = text.split(" ")[0];
		String year = text.split(" ")[1];

		while (!(month.equalsIgnoreCase("April") && year.equalsIgnoreCase("2024"))) {

			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();

			text = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();

			month = text.split(" ")[0];
			year = text.split(" ")[1];
			driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]//a[text()=\"12\"]")).click();
			
		}

	}

}
