package seleniumautomation;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	

		
		public static WebDriver driver;
		
		public static void launchbrowser(String url)
		
		{
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
	  public static void closebrowser()
	  {
		
		driver.close();
	}
	  public static void getscreeshot(String filename) throws IOException {
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 Path sourcePath = scrFile.toPath();
		    File destinationfile = new File("./"+filename+"screenshot.png");
		    OutputStream outputStream = new FileOutputStream(destinationfile);
		    Files.copy(sourcePath, outputStream);
		    //FileUtils.copyFile(scrFile, destinationfile);
			
		}
	  
	  public static String getlocatordata(String pagename ,String elementname) throws IOException
	  {
		  String locatorname="";
		  String locatortype="";
		  File fileexp = new File("C:\\Users\\Nagendra.Pothireddy\\eclipse-workspace\\Demonhdy\\src\\test\\java\\seleniumautomation\\New Microsoft Exce");
		 FileInputStream fis = new FileInputStream(fileexp);
		 XSSFWorkbook xf=new   XSSFWorkbook();
		  XSSFSheet xshet = xf.getSheet("Sheet1");
		  int rownumber = xshet.getLastRowNum();
		  for(int i=1;i<=rownumber;i++)
		  {
			  
			     String page = xshet.getRow(i).getCell(0).getStringCellValue();
			     String element = xshet.getRow(i).getCell(1).getStringCellValue();
			     
			     if(page.equalsIgnoreCase(pagename) && element.equalsIgnoreCase(elementname))
			     {
			           locatortype = xshet.getRow(i).getCell(2).getStringCellValue();
			           locatorname = xshet.getRow(i).getCell(3).getStringCellValue();
			           break;
			           
			     }
			     
		  }
		  xf.close();
		return locatortype+"$"+locatorname;
		  
	  }
	  
	  
	  public static String getconfigdata(String key) throws IOException 
	  {
		  
		  String value ="";
		  File fconfig = new File("C:\\Users\\Nagendra.Pothireddy\\eclipse-workspace\\Demonhdy\\config\\aaa");
		  FileInputStream finput = new FileInputStream(fconfig);
		  Properties fp =new Properties();
		  fp.load(finput);
		  value =fp.getProperty(key);
		  
		return value;
		  
	  }
	  
	  public static By Byclassreference(String pagename ,String elementname) throws IOException
	  {
		  By b=null;
		  String locator =getlocatordata(elementname,pagename);
		  String[]locatordetails = locator.split("$");
		  String locatortype =locatordetails[0];
		  String locatorname =locatordetails[1];
		   if(locatortype.equalsIgnoreCase("id"))
		   {
			   b =By.id(locatorname);
		   }
		   else if(locatortype.equalsIgnoreCase("xpath"))
		   {
			  b= By.xpath(locatorname);
		   }
		   else if(locatortype.equalsIgnoreCase("classname"))
		   {
			  b= By.xpath(locatorname);
		   }
		return b;
		  
	  }
	  public static WebElement getwebelement(String pagename ,String elementname) throws IOException
	  {
		 WebElement e=null;
		  By locator =Byclassreference(pagename,elementname);
		  
		  e= driver.findElement(locator);
		return e;
	  }

}