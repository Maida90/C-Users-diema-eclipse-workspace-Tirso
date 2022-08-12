package Edit.Tirso;
//import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class tirso {
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
		driver.get("https://www.facebook.com/");
	}
	
	@BeforeClass 
	
	public void maxVentana() {
		driver.manage().window().maximize();
	}
	@Test 
  public void registroUsuario() {
		//Defino variable para espera explicita antes de asignar Elemento
				WebDriverWait myWait = new WebDriverWait(driver, 10);
				
				//Email o telefono
				WebElement txtMailTel=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("email"))));
				txtMailTel.sendKeys("maidanaandino90@gmail.com");
				
				//Contraseña
				WebElement txtContrasena=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("pass"))));
				txtContrasena.sendKeys("diealbii09");
				
				/*/Desplegable Mes
				Select dropMes=new Select(myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("month")))));
				dropMes.selectByValue("5");
				
				//Radio Sexo
				WebElement radSex=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[contains(@type,'radio') and @value=1 ]"))));
				radSex.click();*/
				
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
