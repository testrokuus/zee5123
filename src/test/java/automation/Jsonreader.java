package automation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsonreader {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();

			//from
			driver.findElement(By.xpath("//div[@class='makeFlex']/descendant::li[2]")).click();
			driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
			driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Hyd");
			Thread.sleep(2000);
			List<WebElement> a = driver.findElements(By.xpath("//div[@class='react-autosuggest__suggestions-container react-autosuggest__suggestions-container--open']/div/ul/li/descendant::p"));
			Thread.sleep(2000);
			String str ="Hyderabad, India";
			for(WebElement ele :a)
			{
			if(ele.getText().equals(str))
			{
			ele.click();
			break;
			}
			}
			driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween']/descendant::input[@placeholder='To']")).sendKeys("pun");
			Thread.sleep(4000);
			List<WebElement> b = driver.findElements(By.xpath("//div[@class='react-autosuggest__suggestions-container react-autosuggest__suggestions-container--open']/descendant::li"));
			Thread.sleep(2000);
			String zsx = "Pune, India";
			for(WebElement eles:b)
			{
			if(eles.getText().equalsIgnoreCase(zsx));
			{
			eles.click();
			break;
			}
			}
			Thread.sleep(2000);

			//Date Departure
			String date= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			System.out.println(date);
			String asd = "September 2022";
			while(true)
			{
			if(!(date.equals(asd)))
			{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			break;
			}
			}
			List<WebElement> elmnt =driver.findElements(By.xpath("//div[@class='DayPicker-Body']/following::div[@class='DayPicker-Day']"));
			System.out.println(elmnt.size());
			for(WebElement xsd : elmnt)
			{
			//System.out.println(xsd.getText());
			if(xsd.getText().contains("20"))
			{
			xsd.click();
			break;
			}
			}
			Thread.sleep(2000);
			//Date Return
			String date1= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			System.out.println(date1);
			String msd = "September 2022";
			while(true)
			{
			if(!(date.equals(msd)))
			{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			break;
			}
			}
			List<WebElement> elemnt =driver.findElements(By.xpath("//div[@class='DayPicker-Body']/following::div[@class='DayPicker-Day']"));
			System.out.println(elemnt.size());
			for(WebElement xsd : elemnt)
			{
			if(xsd.getText().contains("28"))
			{
			xsd.click();
			break;
			}
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
			driver.quit();
		}

	}


