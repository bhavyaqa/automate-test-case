//changing the voice of listen option
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TestCase8{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement type = driver.findElement(By.id("t_sv"));
		type.sendKeys("bonjour");
		//wait explicitly
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( "t_inauoption"))).click();
		driver.findElement(By.id("t_genradio_M_0")).click();		
		driver.findElement(By.id("t_srcplayc")).click();		
	}
}
