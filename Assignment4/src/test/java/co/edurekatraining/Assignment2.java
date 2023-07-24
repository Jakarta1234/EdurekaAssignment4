package co.edurekatraining;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://www.rediff.com/");
		  
		  // Inspect the “Money” element with class name locator
		  driver.findElement(By.className("moneyicon")).click();
		  System.out.println("Money element inspected with class name locator");
		  driver.quit();
		  
		  WebDriver driver2 = new ChromeDriver(); driver2.manage().window().maximize();
		  driver2.get("https://www.rediff.com/"); 
		  // Inspect the “Money” element with XPath locator 
		  WebElement moneyXpath = driver2.findElement(By
		  .xpath("//a[@title=\"Live commentary of the Indian stock markets, stock quotes and business news\"]"
		  )); moneyXpath.click();
		  System.out.println("Money element inspected with xpath locator");
		  driver2.quit();
		  
		  WebDriver driver3 = new ChromeDriver(); 
		  driver3.manage().window().maximize();
		  driver3.get("https://www.rediff.com/"); 
		  
		  // Inspect the “Money” element with CSS locator
		  driver3.findElement(By.cssSelector("a[class=\"moneyicon relative\"]")).click(
		  ); System.out.println("Money element inspected with CSS locator");
		  driver3.quit();
		  
		  // Inspect the textbox1 with name locator
		  
		  WebDriver driver4 = new ChromeDriver(); driver4.manage().window().maximize();
		  driver4.get("https://www.rediff.com/");
		  
		  driver4.switchTo().frame("moneyiframe");
		  
		  driver4.findElement(By.name("query")).sendKeys("Test1");
		  
		  System.out.println("Textbox1 inspected with name locator");
		  
		  driver4.quit();
		  
		  // Inspect the textbox2 with name locator
		  
		  WebDriver driver5 = new ChromeDriver(); driver5.manage().window().maximize();
		  driver5.get("https://www.rediff.com/");
		  
		  driver5.findElement(By.name("srchquery_tbox")).sendKeys("Test2");
		  
		  System.out.println("Textbox2 inspected with name locator"); driver5.quit();
		  
		  // Inspect the textbox1 with ID locator
		  
		  WebDriver driver6 = new ChromeDriver(); driver6.manage().window().maximize();
		  driver6.get("https://www.rediff.com/");
		  
		  driver6.switchTo().frame("moneyiframe");
		  driver6.findElement(By.id("query")).sendKeys("Test1");
		  
		  System.out.println("Textbox1 inspected with ID locator"); driver6.quit();
		  
		  // Inspect the textbox2 with ID locator
		  
		  WebDriver driver7 = new ChromeDriver(); driver7.manage().window().maximize();
		  driver7.get("https://www.rediff.com/");
		  driver7.findElement(By.id("srchquery_tbox")).sendKeys("Test2");
		  System.out.println("Textbox2 inspected with ID locator"); driver7.quit();
		  
		  // Inspect Rediffmail.com
		  
		  WebDriver driver8 = new ChromeDriver(); driver8.manage().window().maximize();
		  driver8.get("https://www.rediff.com/");
		  driver8.findElement(By.xpath("//a[@title=\"Lightning fast free email\"]")).
		  click(); driver8.navigate().back();
		  System.out.println("Rediffmail.com inspected"); driver8.quit();
		  
		  // Inspect enterprise email
		  
		  WebDriver driver9 = new ChromeDriver(); driver9.manage().window().maximize();
		  driver9.get("https://www.rediff.com/");
		  driver9.findElement(By.cssSelector("a[title=\"Enterprise Email\"]")).click();
		  driver9.navigate().back(); System.out.println("Enterprise email inspected");
		  driver9.quit();
		  
		  // Inspect videos
		  
		  WebDriver driver10 = new ChromeDriver();
		  driver10.manage().window().maximize();
		  driver10.get("https://www.rediff.com/");
		  driver10.findElement(By.xpath("//a[@title=\"Watch videos\"]")).click();
		  driver10.navigate().back(); System.out.println("Videos inspected");
		  driver10.quit();
		  
		  // Inspect business email
		  
		  WebDriver driver11 = new ChromeDriver();
		  driver11.manage().window().maximize();
		  driver11.get("https://www.rediff.com/");
		  driver11.findElement(By.className("bmailicon")).click();
		  driver11.navigate().back(); System.out.println("Business email inspected");
		  driver11.quit();
		  
		  // Inspect rediffGurus (shopping)
		  
		  WebDriver driver12 = new ChromeDriver();
		  driver12.manage().window().maximize();
		  driver12.get("https://www.rediff.com/");
		  driver12.findElement(By.className("shopicon")).click();
		  driver12.navigate().back();
		  System.out.println("RediffGURUS i.e. Shopping inspected"); driver12.quit();
		  
		  // Inspect sign in
		  
		  WebDriver driver13 = new ChromeDriver();
		  driver13.manage().window().maximize();
		  driver13.get("https://www.rediff.com/");
		  driver13.findElement(By.linkText("Sign in")).click();
		  driver13.navigate().back(); System.out.println("Sign in inspected");
		  driver13.quit();
		 

		// Creating an account
		
		  WebDriver driver14 = new ChromeDriver();
		  driver14.manage().window().maximize();
		  driver14.get("https://www.rediff.com/");
		  driver14.findElement(By.partialLinkText("Create Rediffmail")).click();
		  driver14.findElement(By.xpath("//input[@name=\"name1c23e270\"]")).
		  sendKeys("Test Fname Lname");
		  driver14.findElement(By.cssSelector("input[name=\"login1c23e270\"]")).
		  sendKeys("tfl12345");
		  driver14.findElement(By.cssSelector("input.btn_checkavail")).click();
		  driver14.findElement(By.xpath("//input[@id=\"newpasswd\"]")).sendKeys(
		  "Test#1212");
		  driver14.findElement(By.xpath("//em[@id=\"eyeiconNew\"]")).click();
		  driver14.findElement(By.xpath("//input[@id=\"newpasswd1\"]")).sendKeys(
		  "Test#1212");
		  driver14.findElement(By.xpath("//em[@id=\"eyeiconRe\"]")).click();
		  driver14.findElement(By.xpath("//input[@name=\"altemail1c23e270\"]")).
		  sendKeys("tfl12345@gmail.com");
		  driver14.findElement(By.xpath("//input[@id=\"mobno\"]")).sendKeys(
		  "1234567890");
		  
		  WebElement dday = driver14.findElement(By.name("DOB_Day711b4813")); Select
		  select1 = new Select(dday); select1.selectByIndex(25);
		  
		  WebElement dmonth = driver14.findElement(By.name("DOB_Month711b4813"));
		  Select select2 = new Select(dmonth); select2.selectByValue("01");
		  
		  WebElement dyear = driver14.findElement(By.name("DOB_Year711b4813")); Select
		  select3 = new Select(dyear); select3.selectByVisibleText("1991");
		  
		  driver14.findElement(By.xpath("//input[@value=\"f\"]")).click();
		  
		  WebElement dcountry = driver14.findElement(By.name("country711b4813"));
		  Select select4 = new Select(dcountry); select4.selectByValue("99");
		  
		  WebElement dcity = driver14.findElement(By.name("city711b4813")); Select
		  select5 = new Select(dcity); select5.selectByValue("Pune");
		  
		  driver14.findElement(By.xpath("//input[@class=\"captcha\"]")).sendKeys("Test"
		  );
		  
		  driver14.findElement(By.xpath("//input[@id=\"Register\"]")).click();
		 
		
		WebDriver driver15 = new ChromeDriver();
		driver15.manage().window().maximize();
		driver15.get("https://www.rediff.com/");
		List<WebElement> myLinks = driver15.findElements(By.tagName("a"));
		System.out.println("Total tags are : " +myLinks.size());
		
		for(int i=0; i<myLinks.size(); i++) {
			System.out.println("Links on page are : " +myLinks.get(i).getAttribute("href"));
			System.out.println("Links on page are : " +myLinks.get(i).getText());
			
		}
		
	}

}
