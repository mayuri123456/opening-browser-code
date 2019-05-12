package jenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class mavenjenkin {
	static WebDriver driver;
	
@BeforeSuite
public void openbrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
}
@Test
public void loadurl(){
	driver.get("https://www.softwaretestingmaterial.com/selenium-continuous-integration/");
}

@AfterSuite
public void teardown(){
	driver.close();
}
}
