package azaka_survey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	@FindBy (xpath="//h6[text()='Welcome pravin.w']")private WebElement welcome_msg;
	@FindBy(id="logoutBtn")private WebElement signout_Button;
	
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String get_welcome_msg( ) {
		welcome_msg.getText();
		return get_welcome_msg();
	}
	public void Click_Sign_On_Button() {
		signout_Button.click();
	}
}
