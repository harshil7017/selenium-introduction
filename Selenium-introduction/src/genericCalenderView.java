import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class genericCalenderView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(5000);
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Month'] //div[@class='DayPicker-Caption']")).getText().contains("July"))
			{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		List<WebElement> date=driver.findElements(By.className("DayPicker-Day"));
		int count=driver.findElements(By.className("DayPicker-Day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			if(text.equalsIgnoreCase("29"))
		{
			driver.findElements(By.className("DayPicker-Day")).get(i).click();
			break;
		}
		}
	}
}
