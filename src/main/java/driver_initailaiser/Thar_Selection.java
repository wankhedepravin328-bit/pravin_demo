	package driver_initailaiser;
	
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Thar_Selection {
	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	
	        // Create WebDriver instance
	        WebDriver driver = new ChromeDriver();
	
	        // Maximize browser
	        driver.manage().window().maximize();
	
	        // Open URL
	        driver.get("https://www.google.com");
	
	        // Print page title
	        System.out.println("Page Title: " + driver.getTitle());
	        
	        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("thar");
	        
	        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']//span"));
	
	        for(WebElement s : suggestions) {
	            System.out.println(s.getText());
	        }
	        
	        
	//        for(int i=0;i<obj.size();i++)
	//        {
	//        	String obj1 = obj.get(i).getText();
	//        	System.out.println((i + 1) + ": " + obj1);
	//        	
	//        	if(i == 5)
	//            {
	//        		obj1.get(i).click();
	//                System.out.println("Clicked on 6th suggestion: " + obj1);
	//                break;
	//            	
	//            }
	//        }
	        
	       
	        
	        
	        
	        
	        
	        
	        
	        
	        
			
	
		}
	
	}
