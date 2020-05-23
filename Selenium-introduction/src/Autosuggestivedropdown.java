import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.makemytrip.com/");
		WebElement source=driver.findElement(By.id("fromCity"));
		
		Thread.sleep(5000);
		source.sendKeys("ahm");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='calc60'] //p[@class='font14 appendBottom5 blackText']")).click();
		Thread.sleep(5000);
		
		
	
	}

}
