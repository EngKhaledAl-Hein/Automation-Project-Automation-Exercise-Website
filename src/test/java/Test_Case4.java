import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case4 {
    WebDriver driver;
    @BeforeClass

    public void Setup(){
        driver=new ChromeDriver();
        driver.get("https://www.automationexercise.com");
    }
    @Test(description = "Verify that home page is visible successfully", priority = 0)
    public void Home_Visibility(){
        String title= driver.getTitle();
        Assert.assertEquals(title,"Automation Exercise");
        //  WebElement Appered=my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));//pass to navigate Home page
        // Assert.assertTrue(Appered.isDisplayed());
        //my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();//pass to click Signup/Login
        //my_Driver.findElement(By.partialLinkText("Login")).click();//pass to click Signup/Login
        driver.findElement(By.partialLinkText("Signup")).click();// pass to Login Signup/Login
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
        String text=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
        Assert.assertEquals(text,"Login to your account");//pass for confirm new page is opened

        driver.findElement(By.name("email")).sendKeys("khaledmohamedalhain@gmail.com");//pass for name locator
        // my_Driver.findElement(By.tagName("Email Address")).sendKeys("khaledmohamedalhain@gmail.com");//fail to find email field in login
        //my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("khaledmohamedalhain@gmail.com");//pass to find email field
        driver.findElement(By.name("password")).sendKeys("123456Khaled");//pass for find pass field
        // my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("123456Khaled");
        //my_Driver.findElement(By.name("Login")).click();//fail for click by name
        //driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).submit();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();

    }
    @Test(description = "Verify Logout after Creating New account " , priority = 4)
    public void Logout(){
        WebElement Logout_Button= driver.findElement(By.partialLinkText("Logout"));
        Assert.assertTrue(Logout_Button.isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.partialLinkText("Signup")).click();// pass to Login Signup/Login

    }@AfterTest
    @Test(description = "Verify that the browser is closed after run" , priority = 5)
    public void close(){
        driver.quit();
    }
}
