package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.demoblaze.com/index.html#");
driver.manage().window().maximize();
driver.findElement(By.linkText("Laptops")).click();
driver.findElement(By.linkText("Phones")).click();
driver.findElement(By.linkText("Monitors")).click();

WebElement navBar = driver.findElement(By.linkText("About us")); // Replace "navbar" with the actual id or other locator
navBar.click();
driver.findElement(By.cssSelector("#videoModal > div > div > div.modal-footer > button")).click();


driver.findElement(By.cssSelector("#navbarExample > ul > li:nth-child(4) > a")).click();

driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.id("loginusername")).sendKeys("sar_12");
driver.findElement(By.id("loginpassword")).sendKeys("1234");
driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
driver.navigate().refresh();


driver.findElement(By.cssSelector("#navbarExample > ul > li:nth-child(2) > a")).click();
driver.findElement(By.id("recipient-email")).sendKeys("sar12@gmail.com");
driver.findElement(By.id("recipient-name")).sendKeys("Sarath VC");
driver.findElement(By.id("message-text")).sendKeys("hai");
driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
Thread.sleep(4000);
driver.navigate().refresh();







	}

}
