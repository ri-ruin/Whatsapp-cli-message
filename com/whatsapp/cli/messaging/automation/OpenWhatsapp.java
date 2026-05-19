package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWhatsapp{
	public static void openWhatsapp(){
		WebDriver driver = new ChromeDriver();
		//Couldve also been:
		//ChromeDriver driver = new ChromeDriver;
		//Found out that WebDriver is the interface of ChromeDriver which is an implementation of WebDriver
		
		driver.get("https://web.whatsapp.com");

		System.out.println("Whatsapp Opened");
	}
}
