import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
ChromeOptions c=new ChromeOptions();
c.merge(dc);
System.setProperty("webdriver.chrome.driver", "D:\\Udemy selenium classes\\chromedriver_82\\chromedriver.exe");
WebDriver driver = new ChromeDriver(c);
driver.get("https://expired.badssl.com/");
	}

}
