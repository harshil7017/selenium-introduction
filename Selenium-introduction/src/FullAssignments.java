import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FullAssignments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		login(driver);
	
		searchitems(driver);
		
		
	
	}
	public static void login(WebDriver driver) throws InterruptedException
		{
		//mouse hover on login link
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//div[@class='_1jcwFN _3dmQRh'] //a[@class='_3Ep39l']"));
		a.moveToElement(move).build().perform();
		//enter email
		driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj'] //input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9510810896");
		//enter password
		driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj'] //input[@type='password']")).sendKeys("Harshil88@");
	//clicked on logged in button
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();

		System.out.println("Logged in successfull");
		Thread.sleep(7000);
	
	
		}
	public static void searchitems(WebDriver driver) throws InterruptedException
	{
	driver.findElement(By.xpath("//input[@class='LM6RPg']")).click();
		//search items
		Actions a=new Actions(driver);
		WebElement moved=driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		a.moveToElement(moved).sendKeys("Noodles").build().perform();
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(5000);
		System.out.println("search items");
		
	//add to cart
		
		WebElement move=driver.findElement(By.xpath("//div[@class='_3liAhj']"));
		a.moveToElement(move).click().build().perform();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}
				
				
	
}
	


