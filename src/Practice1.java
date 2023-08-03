import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
			public static void main(String[] args) throws InterruptedException {
				
				
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\visit\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

	
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//System.out.println(driver.findElement(By.id("nav-main")).isDisplayed());
		
		driver.findElement(By.linkText("Books")).click(); //Books
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("headset");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']//span[1]")).click();
////		
//		
	Thread.sleep(10000);
driver.findElement(By.xpath("//span[normalize-space()='New York Times Best Sellers']")).click();//New york times best sellers
	
	driver.findElement(By.xpath("//div[@id='acs-product-block-0']//img[@alt='Fourth Wing']")).click();//Fourth wing
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
	System.out.println(driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).isDisplayed());  //Added to cart message
	driver.findElement(By.xpath("//span[@id='a-autoid-3']//input[@name='submit.addToCart']")).click(); // add anotherbookk
	
		driver.findElement(By.xpath("//a[@href='/cart?ref_=sw_gtc']")).click(); // go to cart
		driver.findElement(By.xpath("//h1[normalize-space()='Shopping Cart']")); // Shoppint cart text 
		
		System.out.println(driver.findElement(By.xpath("//img[@alt='Fourth Wing, Opens in a new tab']")).isDisplayed()); // product in cart
		
	System.out.println(driver.findElement(By.xpath("//span[@class='a-truncate-cut'][normalize-space()='Spark City: Book One of the Spark City Cycle']")).isDisplayed());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	String mainw = driver.getWindowHandle();
//		Actions act = new Actions(driver);
//		List<WebElement> links = driver.findElements(By.xpath("(//a)[position() > 1]"));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		for (WebElement temp : links) {
//		    String linkUrl = temp.getAttribute("href");
//
//		    try {
//		        act.keyDown(Keys.CONTROL).click(temp).keyUp(Keys.CONTROL).perform();
//
//		        Set<String> allw = driver.getWindowHandles();
//
//		        for (String temp1 : allw) {
//		            if (!mainw.equals(temp1)) {
//		                driver.switchTo().window(temp1);
//		                System.out.println(driver.getCurrentUrl());
//		                driver.close();
//		            }
//		        }
//
//		        driver.switchTo().window(mainw);
//		    } catch (ElementNotInteractableException e) {
//		        System.out.println("Link not interactable: " + linkUrl);
//		    }
		}

				
				
				
				
				
				
				
				
				
				
				
				}
			    
		




