import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regularexp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
	
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[title*='Sign in'")).click();
		driver.findElement(By.xpath("//input[contains[@name,'login']]")).sendKeys("hello");
	}
}
