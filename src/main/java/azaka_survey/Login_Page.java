package azaka_survey;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Login_Page {
		@FindBy(name="email")private WebElement username;
		
		@FindBy(name="password")private WebElement password;
		
		public Login_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void Enter_User_Id(String UID) {
			username.sendKeys(UID);
			
		}
		public void Enter_Password(String PWD) {
			password.sendKeys(PWD);
		}

	}


}
