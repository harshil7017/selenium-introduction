import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
JavascriptExecutor js=(JavascriptExecutor)driver;
String script="return document.getElementById(\"autocomplete\").value;";
String text=(String) js.executeScript(script);
int i=0;
while(!text.equalsIgnoreCase("India"))
{
	
	i++;
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	text=(String) js.executeScript(script);
	System.out.println(text);
	if(i>5)
{
	System.out.println("element not found");
}
else
{
	System.out.println("element found");
}
}

	
	}

}
