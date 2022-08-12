package Edit.Tirso;

import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Tirso2 {
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		driver= new ChromeDriver();
		//Propiedades para Ejecutar el driver de Chrome
		System.setProperty("webdriver.chrome.driver","..\\Drivers\\chromedriver.exe");
		//Ir a url
		
	}
	
	@BeforeTest
	public void irUrl() {
		driver.get("https://www.tirsolibros.com.ar/");
	}
	
	@BeforeClass 
	
	public void maxVentana() {
		driver.manage().window().maximize();
	}
	@Test 
  public void registroUsuario() throws IOException {
		//Defino variable para espera explicita antes de asignar Elemento
				WebDriverWait myWait = new WebDriverWait(driver, 10);
				//click en img
				WebElement img=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("img[src='gfx/icon_user.png']"))));
				img.click();
				
				//Email o telefono
				WebElement txtMailTel=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("email"))));
				txtMailTel.sendKeys("maidanaandino90@gmail.com");
				
				//Contraseña
				WebElement txtContrasena=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("pass"))));
				txtContrasena.sendKeys("diealbii09");
				
				File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screen,new File("..\\Tirso\\Evidencias\\Test.png"));

	
				//Boton Registrar
				WebElement InicioSecion =myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("pass"))));
				InicioSecion.click();
				
				
			
  }
	
	@AfterClass
	public void finPrueba() {
		System.out.println("Fin de prueba");
	}
	
	@AfterTest 
	public void cierreNavegador() {
		driver.quit();
		
	}
	@AfterSuite
	public void finSuite() {
		System.out.println("Fin Suite");
	}
	
}

