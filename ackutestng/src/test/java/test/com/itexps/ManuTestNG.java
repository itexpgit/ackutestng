/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 *
 * @author Uma
 */
public class ManuTestNG {
    
    private WebDriver driver;
    private String baseUrl;
    
    public ManuTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void InchinsLogin() throws Exception {
        
        driver.get(baseUrl);
        driver.findElement(By.name("email")).sendKeys("ackuselenium5@gmail.com");
        System.out.println("Email Entered");
        driver.findElement(By.name("password")).sendKeys("itexperts");
        System.out.println("Password entered");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Login completed");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"location-list\"]/li[1]/h4/a")).click();
        System.out.println("Chicago location selected");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
        System.out.println("Main Menu selected");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"all-categories\"]/ul/li[6]/a")).click();
        System.out.println("Clicked Noodles Section");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='https://s3-us-west-2.amazonaws.com/www.gethomesome.com/productimages/ibg-noodles-hakka-mod.jpg']")).click();
        System.out.println("Selected Hakka Noodles");
        driver.findElement(By.id("update-btn")).click();
        System.out.println("Item Added to Cart");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[7]/a/span[2]")).click();
        System.out.println("Cart Selected");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[2]/div/a")).click();
        System.out.println("Checkout Selected");
        Thread.sleep(1000);
        driver.findElement(By.name("ccNumber")).sendKeys("234567891234");
        System.out.println("Credit Card Number Entered");
        Thread.sleep(1000);
        driver.findElement(By.name("ccExpiry")).sendKeys("10/23");
        System.out.println("Credit Card Expiry Entered");
        Thread.sleep(1000);
        driver.findElement(By.name("ccCvc")).sendKeys("203");
        System.out.println("Credit Card CVV Number Entered");
        Thread.sleep(1000);
        driver.findElement(By.name("phoneUS")).sendKeys("4029067731");
        System.out.println("Phone Number Entered");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[4]/div[2]/div/ul/li[7]/div/a")).click();
        //System.out.println("Order Placed");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//b[@class='caret']")).click();
        System.out.println("Yummy Order Placed");
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[6]/ul/li[4]/a")).click();
        System.out.println("Logout completed");
        driver.close();
    }
	



    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        baseUrl = "https://www.inchinsonline.com/login";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
}
