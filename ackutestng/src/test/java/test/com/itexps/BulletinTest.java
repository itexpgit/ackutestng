/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


/**
 *
 * @author Uma
 */
public class BulletinTest {
     private WebDriver driver;
  private String baseUrl;
    
    public BulletinTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Bulletincheck() throws InterruptedException {
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("[title=\"IBG Bulletin\"]")).click();
    Thread.sleep(2000);
   
    driver.findElement(By.id("Name")).click();
    driver.findElement(By.id("Name")).clear();
    driver.findElement(By.id("Name")).sendKeys("Arti Verma");
    Thread.sleep(2000);
    
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("ackuselenium@gmail.com");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    new Select(driver.findElement(By.xpath("(//select[@id='Location'])[2]"))).selectByVisibleText("Chicago, IL - Schaumburg");
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='contact_form_fields']/div[4]")).click();

    driver.findElement(By.name("Captcha")).click();
    driver.findElement(By.name("Captcha")).click();
    driver.findElement(By.name("Captcha")).clear();
    driver.findElement(By.name("Captcha")).sendKeys("5738");
    driver.findElement(By.xpath("//input[@value='Send']")).click();
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
        baseUrl = "https://bamboo-gardens.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
}
