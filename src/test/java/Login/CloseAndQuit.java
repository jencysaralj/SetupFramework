package Login;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class CloseAndQuit
{
   // static WebDriver driver;
    @BeforeClass
    public static void befClass()
    {
        System.setProperty("webdriver.chrome.driver","/Users/jency.saral/Downloads/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        driver.quit();
    }

    @Test
    public void MyMethod() throws AWTException, InterruptedException
    {
        WebDriver driver= new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        driver.findElement(By.cssSelector("button[class='btn btn-default btn-twitter']")).click();
        driver.close();
        //driver.quit();
    }
}