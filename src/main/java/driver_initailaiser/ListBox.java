package driver_initailaiser;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ListBox {

	private static final String TakesScreenshot = null;

	public static <TakesScreenshot> void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		Thread.sleep(100);
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("bosco");
		 WebElement day = driver.findElement(By.name("birthday_day"));
		 Select s = new Select(day);
		 for(int i=0;i<=9;i++)
		 {
			 s.selectByIndex(i);
			 Thread.sleep(100);
		 }
		 
	//	File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File dest = new File ("");
	//	FileHandler.copy(screen, dest);
		

	}

}
