import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
	
	}

}
