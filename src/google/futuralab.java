package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class futuralab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\Downloads\\\\\\\\chromedriver-win32\\\\\\\\chromedriver-win32\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://thefuturalabs.com/");
driver.manage().window().maximize();
driver.findElement(By.id("menu-item-430")).click();
}
	}


