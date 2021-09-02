import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample110 {

	String [][]data= {
			{"java","java@123"},
			{"sql","sql@123"},
			{"python","python@99"}
	};
	
	@DataProvider(name="logindata")
	public String[][]logindatatprovider(){
		return data;
	}
	@Test(dataProvider="logindata")
	public void loginfb(String uname,String pwd) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Lumin\\chrome92\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pwd);
	}
}
