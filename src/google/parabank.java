package google;

import org.openqa.selenium.By;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class parabank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\anju.krishna\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
WebDriverDecorator driver=new WebDriverDecorator();
driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=81A6E762AD3EBB496E882D3862A503ED");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("#loginPanel > p:nth-child(3) > a")).click();
driver.findElement(By.id("customer.firstName")).sendKeys("Anju");
driver.findElement(By.id("customer.lastName")).sendKeys("Krishna");
driver.findElement(By.id("customer.address.street")).sendKeys("Bangalore");

		driver.findElement(By.id("customer.address.city")).sendKeys("Madivala");

		driver.findElement(By.id("customer.address.state")).sendKeys("Karnataka");

		driver.findElement(By.id("customer.address.zipCode")).sendKeys("560027");

		driver.findElement(By.id("customer.phoneNumber")).sendKeys("7902205307");

		driver.findElement(By.id("customer.ssn")).sendKeys("abc");

		driver.findElement(By.id("customer.username")).sendKeys("akn");

		driver.findElement(By.id("customer.password")).sendKeys("1234");

		driver.findElement(By.id("repeatedPassword")).sendKeys("1234");

		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();

		//driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();

		//((ChromeDriver)driver).executeScript("window.open('https://parabank.parasoft.com/parabank/index.htm;jsessionid=81A6E762AD3EBB496E882D3862A503ED','_blank')");
		
		
	}

}
