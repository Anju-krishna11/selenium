package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectorshub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://selectorshub.com/xpath-practice-page/#");
driver.manage().window().maximize();
driver.findElement(By.name("email")).sendKeys("akn@gmail.com");
driver.findElement(By.name("Password")).sendKeys("1234");
driver.findElement(By.name("company")).sendKeys("SRIT");
driver.findElement(By.name("mobile number")).sendKeys("8906754789");
//driver.findElement(By.cssSelector("#content > div > div.elementor.elementor-1097 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-0731668.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-50.elementor-top-column.elementor-element.elementor-element-b7d792b > div > div.elementor-element.elementor-element-459c920.elementor-widget__width-inherit.elementor-widget.elementor-widget-html > div > div > button")).click();


WebElement checkbox = driver.findElement(By.id("ohrmList_chkSelectRecord_25"));

// Check if the checkbox is not already selected
if (!checkbox.isSelected()) {
    // Click the checkbox to select it
    checkbox.click();
    
 //driver.findElement(By.linkText("")).sendKeys("Anu");
 //driver.findElement(By.linkText("Enter pizza name")).sendKeys("test");
// driver.findElement(By.linkText("Does DevTools ctl+f gives always the right count of xpath match?")).sendKeys("123");
 //driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("12345"); 
 //not able to access through webdriver
    
    
 WebElement element1=driver.findElement(By.xpath("//*[@id=\"tablepress-1_length\"]/label/select"));
 Select dropdown=new Select(element1);
 dropdown.selectByVisibleText("25");
 
 //WebElement radioButton1 = driver.findElement(By.linkText("Yes"));
 //WebElement radioButton2 = driver.findElement(By.linkText("No"));
// WebElement radioButton3 = driver.findElement(By.linkText("Installed Now"));

 // Click on the first radio button
 //radioButton1.isSelected();

 // Check if the first radio button is selected
 //if (radioButton1.isSelected()) {
    // System.out.println("Radio Button 1 is selected");
 //} //else {
    // System.out.println("Radio Button 1 is not selected");
// }

 // Click on the second radio button
 //radioButton2.isSelected();

 // Check if the second radio button is selected
 //if (radioButton2.isSelected()) {
    // System.out.println("Radio Button 2 is selected");
// } //else {
     //System.out.println("Radio Button 2 is not selected");
// }

 // Click on the third radio button
 //radioButton3.isSelected();

 // Check if the third radio button is selected
 //if (radioButton3.isSelected()) {
    // System.out.println("Radio Button 3 is selected");
// } else {
 //    System.out.println("Radio Button 3 is not selected");
 }

 
}
}
 
		
	

	//}

