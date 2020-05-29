import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.internal.junit.ArrayAsserts;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> firstcollist=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalList=new ArrayList<String>();
		
		for(int i=0;i<firstcollist.size();i++)
		{
			System.out.println(driver.findElements(By.cssSelector("tr td:nth-child(2)")).get(i).getText());
		}
		ArrayList<String> copiedlList=new ArrayList<String>();
		for(int i=0;i<originalList.size();i++)
		{
			copiedlList.add(originalList.get(i));
		}
		Collections.sort(copiedlList);
		Collections.reverse(copiedlList);
		for(String s:originalList)
		{
			System.out.println(s);
		}
		System.out.println("************************");
		for(String s1:copiedlList)
		{
			System.out.println(s1);
		}
		Assert.assertTrue(originalList.equals(copiedlList));
	}

}
