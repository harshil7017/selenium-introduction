
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://grofers.com/cn/vegetables-fruits/cid/1487");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		String[] itemsNeeded = {"Onion","Kiwi","Lemon"};
		
		driver.findElement(By.xpath("//div[@class='location-body__selected-title']")).click();
		Thread.sleep(10000);
	//WebDriverWait w=new WebDriverWait(driver,30);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='location-body__selected-title']")));
		
		addItems(driver,itemsNeeded);
	}	
		
		public static void addItems(WebDriver driver,String[] itemsNeeded)
		{
			int j = 0;
			List<WebElement> items = driver.findElements(By.cssSelector("div[data-test-id='plp-product-name']"));
		for (int i = 0; i < items.size(); i++) 
		{
			String[] veg = items.get(i).getText().split("-");
			String formattedName = veg[0].trim();
		

			List itemsList = Arrays.asList(itemsNeeded);
			
			if (itemsList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//button[@data-test-id='add-button']")).get(i).click();
			
				if (j == itemsNeeded.length)
				{
					
					break;
				}
			}

		}

		}

}
