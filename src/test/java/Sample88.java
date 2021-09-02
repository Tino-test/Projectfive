import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample88 {
	public WebDriver driver;

	@Test(dataProvider = "data") 
	private void tc(String bats) { 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Lumin\\chrome92\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(bats);
	
	}
	

	@DataProvider(name="data")
	private Object[][] datas() {
		
		return new Object[][] {
			{ "cricketbats",  },
			{ "tennisbat",  },
			{"cricketball"},
			{"tennisball"}
	};
	}

}
