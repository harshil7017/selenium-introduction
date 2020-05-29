
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Fullassignment2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// for ssl
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		// open browser
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		login(driver);
		searchItems(driver);
		//addtocart(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\screenshot.png"));
		
	}
	
		
		
	
	public static void login(WebDriver driver) throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.className("_3Ep39l"))).build().perform();
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj'] //input[@class='_2zrpKA _1dBPDZ']"));
		email.sendKeys("9510810896");
		//enter password
		WebElement pass=driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj'] //input[@type='password']"));
		pass.sendKeys("Harshil88@");
	//clicked on logged in button
	
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(3000);
		
		
}
	public static void searchItems(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("noodles");
	
		WebElement items=driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		Thread.sleep(3000);
		
		System.out.println("search items successfully");
		int i=0;
		while(!items.getText().equalsIgnoreCase("noodles pack"))
				{
			driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(Keys.ARROW_DOWN);
			i++;
			if(i==2)
			{
				driver.findElement(By.cssSelector("button[class='vh79eN']")).click();
				
				break;
			}
			
				
				}		
	
			
			
	}
	public static void addtocart(WebDriver driver) throws InterruptedException
	{
		WebElement move=driver.findElement(By.xpath("//div[@class='_1rcHFq']"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(move).click().build().perform();
	
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String ChildId=it.next();
		Thread.sleep(3000);
		driver.switchTo().window(ChildId);
		System.out.println(driver.getTitle());
	}
}

