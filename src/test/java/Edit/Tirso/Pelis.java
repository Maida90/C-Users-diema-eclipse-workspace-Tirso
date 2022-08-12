package Edit.Tirso;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Pelis {
	WebDriver d;
	@Test
	public void lab1_E2(){
		//Propiedades para ejecutar el driver de Firefox	
		System.setProperty("webdriver.gecko.driver","..\\Prueba\\Drivers\\geckodriver.exe");
		//Instancias Driver de Firefox + importar libreria	
		
		WebDriver d= new FirefoxDriver();
		d.get("https://www.pelisplus2.io/peliculas/accion/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
	}	
}
