import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.cleartrip.com/");
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");
		Select s1=new Select(driver.findElement(By.name("childs")));
		s1.selectByIndex(2);
		Select s2=new Select(driver.findElement(By.xpath("//select[@id='Infants']")));
		s2.selectByValue("2");
		Thread.sleep(5000);
	
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active" )).click();
		driver.findElement(By.xpath("//i[@class='rArrow blue']")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
