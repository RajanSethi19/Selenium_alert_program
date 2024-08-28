package Alert_Javascript_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		;
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Name\"]"));
		e1.sendKeys("Rajan");

		WebElement e2 = driver.findElement(By.xpath("//input[@id=\"confirmbtn\"]"));
		Thread.sleep(3000);
		e2.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

}
