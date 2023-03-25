package basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://www.facebook.com/signup");
//		WebElement allmonth = driver.findElement(By.id("month"));
//        Select s=new Select(allmonth);
////        s.selectByIndex(4);
//        for (int i = 0; i < 12; i++) {
//			s.selectByIndex(i);
//		}
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement country = driver.findElement(By.name("Country"));
        Select s=new Select(country);
            List<WebElement> allcountry = s.getOptions();
	for (WebElement webElement : allcountry) {
		System.out.println(webElement.getText());
		s.selectByVisibleText(webElement.getText());System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://www.facebook.com/signup");
//		WebElement allmonth = driver.findElement(By.id("month"));
//        Select s=new Select(allmonth);
////        s.selectByIndex(4);
//        for (int i = 0; i < 12; i++) {
//			s.selectByIndex(i);
//		}
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement country = driver.findElement(By.name("Country"));
        Select s=new Select(country);
            List<WebElement> allcountry = s.getOptions();
	for (WebElement webElement : allcountry) {
		System.out.println(webElement.getText());
		s.selectByVisibleText(webElement.getText());
	}
}
}

	}
}
}
