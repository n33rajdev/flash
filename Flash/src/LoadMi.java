import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadMi implements Runnable{

	@Override
	public void run() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.event.mi.com/in/diwali-with-mi-2019-sale");
		
		try {
			long counter = 0;
			WebElement element = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/ul/li[4]/a"));
			element.click();
			WebElement element2 = driver.findElement(By.xpath("//html/body/div[1]/div[21]/div/div[4]/div/div[4]/ul/li/div[2]/div/div[2]/div[2]/a"));
			while(true) {
				counter++;
				element2.click();
				System.out.println(counter);
			}
			
		} catch(Exception e) {
			
		}
		
	}

}
