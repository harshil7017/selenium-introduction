import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("harshil.sheth@rocketmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("9510810896h");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	}

}
