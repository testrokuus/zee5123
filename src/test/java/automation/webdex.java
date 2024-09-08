package automation;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class webdex {

  
    	    public static void main(String[] args) {
    	       
//    	        WebDriver driver = new ChromeDriver();
//    	        driver.manage().window().maximize();
//    	        // Step 1: Go to the BigBasket website
//    	        driver.get("https://www.bigbasket.com/");
//
//    	        // Step 2: Find and select 5 random products
//    	        List<WebElement> products = driver.findElements(By.xpath("//div[@qa='product']"));
//    	        Random random = new Random();
//    	        Set<String> selectedProducts = new HashSet<String>();
//
//    	        if (products.size() > 0) { // Ensure there are products available
//    	            while (selectedProducts.size() < 5) {
//    	                int randomIndex = random.nextInt(products.size());
//    	                WebElement product = products.get(randomIndex);
//    	                String productName = product.getText();
//
//    	                // Add the product to the basket
//    	                String addButtonXpath = "(//button[@qa='add'])[" + (randomIndex + 1) + "]";
//    	                driver.findElement(By.xpath(addButtonXpath)).click();
//
//    	                selectedProducts.add(productName);
//    	            }
//    	        } else {
//    	            System.out.println("No products found. Please check the website.");
//    	        }
//
//    	        // Step 3: Verify if the same products are added to the basket
//    	        driver.get("https://www.bigbasket.com/cl/my-basket/");
//    	        List<WebElement> basketItems = driver.findElements(By.xpath("//div[@qa='basket-product']"));
//
//    	        for (WebElement basketItem : basketItems) {
//    	            String itemName = basketItem.findElement(By.xpath(".//a")).getText();
//    	            if (selectedProducts.contains(itemName)) {
//    	                System.out.println("Product '" + itemName + "' is in the basket.");
//    	            } else {
//    	                System.out.println("Product '" + itemName + "' is NOT in the basket.");
//    	            }
//    	        }

    	       

    }
}

