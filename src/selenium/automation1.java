package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class automation1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Koushik\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
		WebElement xyz = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		xyz.sendKeys("Admin");
		WebElement a = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		a.sendKeys("admin123");
		WebElement b = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		b.click();
		Thread.sleep(2000);
	
		WebElement d = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		d.click();
		WebElement c = driver.findElement(By.xpath("//textarea["]"));
		c.click();
		WebElement e = driver.findElement(By.xpath(""));
		e.click();
		
		
		
//		driver.quit();
	}

}
