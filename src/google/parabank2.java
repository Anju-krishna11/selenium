package google;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class parabank2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
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
driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=81A6E762AD3EBB496E882D3862A503ED");
driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("akn");

driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("1234");
driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();

driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();

driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=81A6E762AD3EBB496E882D3862A503ED");
driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
driver.findElement(By.xpath("//*[@id=\"adminForm\"]/input")).click();

driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
WebElement element1=driver.findElement(By.xpath("//*[@id=\"type\"]"));
Select dropdown=new Select(element1);
dropdown.selectByVisibleText("SAVINGS");

WebElement element2=driver.findElement(By.cssSelector("#fromAccountId"));
Select dropdown1=new Select(element2);
dropdown1.selectByVisibleText("20892");

driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input")).click();
driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a")).click();

driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
driver.findElement(By.name("payee.name")).sendKeys("Anju");
driver.findElement(By.name("payee.address.street")).sendKeys("Bangalore");
driver.findElement(By.name("payee.address.city")).sendKeys("Madiwala");
driver.findElement(By.name("payee.address.state")).sendKeys("Karnataka");
driver.findElement(By.name("payee.address.zipCode")).sendKeys("560029");
driver.findElement(By.name("payee.phoneNumber")).sendKeys("9956378902");
driver.findElement(By.name("payee.accountNumber")).sendKeys("973567892900655");
driver.findElement(By.name("verifyAccount")).sendKeys("973567892900655");
driver.findElement(By.name("amount")).sendKeys("500");

WebElement element3=driver.findElement(By.id("fromAccountId"));
Select dropdown2=new Select(element3);
dropdown2.selectByVisibleText("21669");

WebElement button=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input"));
button.click();


//driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a")).click();




//driver.findElement(By.id("amount")).sendKeys("200");
//driver.navigate().refresh();

//WebElement element3=driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]"));
//Select dropdown2=new Select(element3);
//dropdown2.selectByVisibleText("16674");

//WebElement element4=driver.findElement(By.xpath("//*[@id=\"toAccountId\"]"));
//Select dropdown3=new Select(element4);
//dropdown3.selectByVisibleText("17340");

//driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input")).click();

//driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();









//driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();

//((ChromeDriver)driver).executeScript("window.open('https://parabank.parasoft.com/parabank/index.htm;jsessionid=81A6E762AD3EBB496E882D3862A503ED','_blank')");
	
	
	}

}
