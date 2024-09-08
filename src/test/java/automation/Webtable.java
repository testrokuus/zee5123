package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Webtable {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
	    driver.get("https://money.rediff.com/gainers");
	    List<WebElement> totalrows =  driver.findElements(By.xpath("//table[@class='dataTable']/thead/following-sibling::tbody/tr"));

	    for(int r=0;r<=totalrows.size()-1;r++)
	    {
	    	String allcolumns= "//table[@class='dataTable']/thead/following-sibling::tbody/tr["+(r+1)+"]/td";
	    	
	    	List<WebElement> allc = driver.findElements(By.xpath(allcolumns));
	    	
	    	for(int c=0;c<=allc.size()-1;c++)
	    	{
	    		String xp = allcolumns+"["+(c+1)+"]";
	    		
	    		System.out.println(driver.findElement(By.xpath(xp)).getText());
	    	}
	    }     
	}
}
  