import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class winAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		
		String childId=it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("/html/body/div")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());
		
	}

}
