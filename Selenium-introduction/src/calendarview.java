import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calendarview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://gsrtc.in/site/"); Select s=new
		 * Select(driver.findElement(By.id("selectNoOfPassengersOA")));
		 * s.selectByValue("2"); s.selectByIndex(4); s.selectByVisibleText("1");
		 */
		// open site
		driver.get("https://book.spicejet.com/");
		Thread.sleep(5000);
		// clicked on from-city (dropdown value)
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).sendKeys("amd");
		Thread.sleep(5000);
		// select values from to-city
		driver.findElement(By.partialLinkText("Vishakhapatnam (VTZ)")).click();
		// select date
		driver.findElement(By.xpath("//input[@class='custom_date_pic required home-date-input']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class='ui-state-default']")).click();
		// radio button selection

		driver.findElement(By.xpath("//div[@id='OneWay'] //input[@value='OneWay']")).click();
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		if (driver.findElement(By.id("marketDate_1")).getAttribute("style").contains("0.5")) {
			System.out.println("it is disabled");
			Assert.assertTrue(false);
		} else {

			Assert.assertTrue(true);
		}

		driver.findElement(By.xpath("//option[@value='AED']")).click();
		driver.findElement(By.xpath("//input[@class='bookbtn']")).click();
	}
}
