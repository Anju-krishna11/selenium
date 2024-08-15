package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");
driver.manage().window().maximize();
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
Thread.sleep(4000);
driver.findElement(By.cssSelector("#inventory_item_container > div > div > div > button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
driver.findElement(By.id("first-name")).sendKeys("Anju");
driver.findElement(By.id("last-name")).sendKeys("Krishna");
driver.findElement(By.id("postal-code")).sendKeys("673008");
driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
driver.findElement(By.id("inventory_sidebar_link")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).click();
//driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
WebElement element=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
element.sendKeys("Price (low to high)");
element.click();
driver.navigate().refresh();
WebElement element1=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
element1.sendKeys("Price (high to low)");
driver.navigate().refresh();
WebElement element2=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
element2.sendKeys("Name (Z to A)");
driver.navigate().refresh();
WebElement element3=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
element3.sendKeys("Name (A to Z)");
driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
driver.findElement(By.id("about_sidebar_link")).click();
driver.get("https://www.saucedemo.com/v1/inventory.html");
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
driver.findElement(By.id("logout_sidebar_link")).click();
//WebElement element4=driver.findElement(By.cssSelector("#inventory_filter_container > select"));
//element4.sendKeys("Price (low to high)");
//element.click();

//WebElement element5=driver.findElement(By.id("menu_button_container"));
//element.click();
//driver.findElement(By.id("reset_sidebar_link")).click();
driver.close();

	}

}
