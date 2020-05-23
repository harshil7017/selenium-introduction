import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://gsrtc.in/site/");
		Select s=new Select(driver.findElement(By.id("selectNoOfPassengersOA")));
		s.selectByValue("2");
		s.selectByIndex(4);
		s.selectByVisibleText("1");*/
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
			i++;
		}
		
		
	}

}
