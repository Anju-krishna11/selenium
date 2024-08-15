package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Find the element that triggers the expansion/collapse
        WebElement expandButton = driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));

        // Click on the element to expand/collapse
        expandButton.click(); 
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));

        // Check if the checkbox is not already selected
        if (!checkbox.isSelected()) {
            // Click the checkbox to select it
            checkbox.click();
        }

        // Optionally, you can verify if the checkbox is selected
       // if (checkbox.isSelected()) {
          //  System.out.println("Checkbox is selected!");
        } //else {
          //  System.out.println("Checkbox is not selected!");
        

	}


