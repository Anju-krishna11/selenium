package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		boolean isLoggedIn = false;
		driver.findElement(By.id("username")).sendKeys("akn123");
		driver.findElement(By.id("password")).sendKeys("12356");
		driver.findElement(By.id("submit")).click();
		if(isLoggedIn)
		{
			System.out.println("Logged in successfully");
		}
		else {
			System.out.println("Logged in unsuccessfully");
		}

	}

}
