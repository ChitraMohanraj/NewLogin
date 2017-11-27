package loginout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Logg {
	public void getLog(){
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.findElementByLinkText("Datepicker").click();
	driver.close();
	//launch google browser 
	//new changes
	driver.get("www.google.com");
	driver.close();
}
}
