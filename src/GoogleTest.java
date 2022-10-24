

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
	public void HomePage() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		//caps.setPlatform();
		//caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.88:4444"), caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Anejah Crooms");
		driver.close();
	}
}
