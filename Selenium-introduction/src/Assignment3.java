import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("i[class='icon ir datePicker']")).click();
		Thread.sleep(5000);
		while(!driver.findElement(By.xpath("//div[@class='header'] //div[@class='title'] //span[@class='ui-datepicker-month']")).getText().contains("August"))
		{
		
				driver.findElement(By.className("nextMonth")).click();
			
			
		}
		List<WebElement> date=driver.findElements(By.className("undefined"));
		int count=driver.findElements(By.className("undefined")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("undefined")).get(i).getText();
		if(text.equalsIgnoreCase("29"))
				{
			driver.findElements(By.className("undefined")).get(i).click();
			break;
				}
		}
	}

}
