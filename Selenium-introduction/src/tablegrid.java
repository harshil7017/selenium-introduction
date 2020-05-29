import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablegrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-team/india/2/stats");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col-75 cb-col pad10']"));
	int rowcount=table.findElements(By.className("cb-srs-stats-tr")).size();
			
		int count=	table.findElements(By.cssSelector("tr[class='cb-srs-stats-tr'] td:nth-child(3)")).size();
	for(int i=0;i<count;i++)
	{
		System.out.println(driver.findElements(By.cssSelector("tr[class='cb-srs-stats-tr'] td:nth-child(3)")).get(i).getText());
	}
	}

}
