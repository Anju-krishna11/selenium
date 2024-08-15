package google;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.get("https://demoqa.com/upload-download");
driver.manage().window().maximize();
String filePath = "C:\\Users\\HP\\Downloads\\SampleFile.jpeg";

// If using RemoteWebDriver, set LocalFileDetector to upload files from local machine
if (driver instanceof RemoteWebDriver) {
    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
}

// Find the file input element by its ID, name, XPath, or any other suitable locator
WebElement fileInput = driver.findElement(By.cssSelector("#uploadFile"));

// Send the file path to the file input element
fileInput.sendKeys(filePath);
	}

}
