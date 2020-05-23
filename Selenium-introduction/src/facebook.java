import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Udemy selenium classes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("harshil.sheth@rocketmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9510810896h");
		driver.findElement(By.linkText("Log In")).click();
		driver.manage().window().maximize();
	}

}
