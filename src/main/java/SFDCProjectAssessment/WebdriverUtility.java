package SFDCProjectAssessment;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtility {
	
	static WebDriver driver;
	
	static void WebdriverLaunch(String sBroswer) {
		if (sBroswer.startsWith("ch")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else {
			System.out.println("Please Provide proper Broswer");
		}
	}
	
	static void Fileloading() {
		try{
		String str = "C:\\Users\\chirag\\workspace\\SFDCProjectAssessment\\src\\main\\java\\Text.properties";
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(str);
		prop.load(fi);
		System.getProperties().putAll(prop);
	}catch (Exception b){
		System.out.println(b);
	}

	}
	static void loginFunction(){
		waitforloadthepageElement(driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).sendKeys(System.getProperty("Username"));
		driver.findElement(By.id("password")).sendKeys(System.getProperty("TC2password"));
		driver.findElement(By.id("Login")).click();
	}
	
	static void LogoutFunction(){
		driver.findElement(By.id("userNavLabel")).click();
		waitforloadthepageElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	}
	
	static void waitforloadthepageElement(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
