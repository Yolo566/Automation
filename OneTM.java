package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OneTM {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("http://153.88.35.162:8080/arsys/shared/login.jsp?/arsys/home");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//*[@id=\"username-id\"]")).sendKeys("username");
		d.findElement(By.xpath("//*[@id=\"pwd-id\"]")).sendKeys("pwd");
		
		d.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table[2]/tbody/tr/td[2]/table/tbody/tr[5]/td[3]/input[1]")).click();
		
		
		
		//hover handling
		 WebElement ele =d.findElement(By.xpath("/html/body/div[1]/div[5]/div[11]/div/div[2]/a/span"));
		  
		  Actions action = new Actions(d);
		  
		  action.moveToElement(ele).perform();
		  
		  d.findElement(By.xpath("//*[@id=\"FormContainer\"]/div[11]/div/div[2]/div/div[4]/a\r\n" +"")).click();
		  
		  
		  
		  d.findElement(By.xpath("//*[@id=\"arid_WIN_0_1302051501\"]")).sendKeys("some id");
		  
	  d.findElement(By.id("arid_WIN_0_1302051501")).sendKeys(Keys.ENTER);

		  

		 
		  //for new tab handling
		  Set<String> handles = d.getWindowHandles();
		    String currentHandle = d.getWindowHandle();
		    for (String handle : handles) {

		     if (!handle .equals(currentHandle))
		     {
		         d.switchTo().window(handle);
		     }
		   }
		    d.findElement(By.xpath("//*[@id=\"Toolbar\"]/table/tbody/tr/td[3]/a[3]")).click();
		    d.findElement(By.xpath("//*[@id=\"arid1005\"]")).sendKeys("('Modified Date' <= $TIMESTAMP$) AND ('State' = \"Queued\") AND ('Group' = \"Change Management\") AND ('Customer' = \"Bharti-MS-IN\")");
		    d.findElement(By.xpath("//*[@id=\"TBsearchsavechanges\"]")).click();
		    
		  //*[@id="WIN_0_1020"]/div[3]/table/tbody/tr/td[1]/a[2]
		    
		 
		  //*[@id="WIN_0_1020"]/div[3]/table/tbody/tr/td[1]/a[2]
		    
		    String popup = d.getWindowHandle();
		    d.switchTo().window(popup);
			
			//scroll handling
			 JavascriptExecutor jse = (JavascriptExecutor)d;
			 jse.executeScript("window.scrollBy(0,250)", "");
			
			 d.findElement(By.xpath("//*[@id=\"T93250\"]/tbody/tr[97]/td[2]/nobr/span\r\n" + "")).click();
		    
		    
				Select s  = new Select(d.findElement(By.xpath("//*[@id=\"WIN_0_2000053\"]/div/a/img")));
				s.selectByVisibleText("File");
				s= new Select(d.findElement(By.xpath("//*[@id=\"WIN_0_2000056\"]/div/a/img")));
				s.selectByVisibleText("CSV");
				Thread.sleep(2000);
				
				

		    d.findElement(By.xpath("//*[@id=\"reg_img_93272\"]")).click();
		    
		    
		    
		}
	
	

}
