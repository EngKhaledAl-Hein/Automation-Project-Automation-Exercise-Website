import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Test_Case3 {
    WebDriver Driver;
    WebDriverWait wait;
    @BeforeTest
    public void SetUp(){
        Driver=new ChromeDriver();
        Driver.navigate().to("https://www.automationexercise.com");
       // Driver.get("https://www.automationexercise.com");
    }
    @Test(description = "Verify that home page is visible successfully", priority = 0)
    public void Home_Visibility(){
        String title= Driver.getTitle();
        Assert.assertEquals(title,"Automation Exercise");
        //  WebElement Appered=my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));//pass to navigate Home page
        // Assert.assertTrue(Appered.isDisplayed());
        //my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();//pass to click Signup/Login
        //my_Driver.findElement(By.partialLinkText("Login")).click();//pass to click Signup/Login
        Driver.findElement(By.partialLinkText("Signup")).click();// pass to Login Signup/Login
    }
    @Test(description = "Verify 'Login to your account' is visible",priority = 1)
    public void Login_Visible(){
//        String tap_title=my_Driver.getTitle();
//        Assert.assertEquals(tap_title,"Automation Exercise - Signup / Login");//pass to move new tap with the main tap title
        // String variable= my_Driver.getCurrentUrl();//pass without doing am assertation for element such as web Element title
        //System.out.println("variable link  is " + variable);//
        //
//        WebElement getText=my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
//        Assert.assertTrue(getText.isDisplayed());// this tool only boolean condition using WebElement
        String text=Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
        Assert.assertEquals(text,"Login to your account");//pass for confirm new page is opened

       Driver.findElement(By.name("email")).sendKeys("khaled@gmail.com");//pass for name locator
        // my_Driver.findElement(By.tagName("Email Address")).sendKeys("khaledmohamedalhain@gmail.com");//fail to find email field in login
        //my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("khaledmohamedalhain@gmail.com");//pass to find email field
       Driver.findElement(By.name("password")).sendKeys("Khaled");//pass for find pass field
        // my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("123456Khaled");
        //my_Driver.findElement(By.name("Login")).click();//fail for click by name
        Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).submit();
    }

    @Test(description = "Verify error 'Your email or password is incorrect!' is visible" , priority = 2)
    public  void Error(){
        WebElement error_message=Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));
        Assert.assertTrue(error_message.isDisplayed());
    }
}
