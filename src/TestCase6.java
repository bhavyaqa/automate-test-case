//Clear all text
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCase6{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		WebElement type = driver.findElement(By.id("t_sv"));
		type.sendKeys("bonjour");
		driver.findElement(By.id("t_edc")).click();
	}
}
