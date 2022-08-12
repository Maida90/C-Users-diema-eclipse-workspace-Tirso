package Paginas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicio {
	
	@FindBy(xpath ="//img[@src='gfx/icon_user.png']")
	WebElement lnkSingIn;
	
	public   PaginaInicio(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicSingIn() {
		lnkSingIn.click();
	}
}

