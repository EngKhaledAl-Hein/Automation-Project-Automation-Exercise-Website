import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case2 {
    WebDriver my_Driver;
//   // @Test(dependsOnMethods = "testcases.Test_Case1.case1_test")
//    @Test (dependsOnMethods = "testcases.Test_case1.case1_test")
//    public void case2_test() {
//        System.out.println("Running Test Case 2");
//    }
    @BeforeClass
    public void SetUp(){
        my_Driver= new ChromeDriver();
       // my_Driver.navigate().to("https://www.automationexercise.com");
        my_Driver.get("https://www.automationexercise.com");
    }
    @Test(description = "Verify that home page is visible successfully", priority = 0)
    public void Home_Visibility(){
      String title= my_Driver.getTitle();
     Assert.assertEquals(title,"Automation Exercise");
     //  WebElement Appered=my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));//pass to navigate Home page
      // Assert.assertTrue(Appered.isDisplayed());
       //my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();//pass to click Signup/Login
       //my_Driver.findElement(By.partialLinkText("Login")).click();//pass to click Signup/Login
        my_Driver.findElement(By.partialLinkText("Signup")).click();// pass to Login Signup/Login
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
        String text=my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
        Assert.assertEquals(text,"Login to your account");//pass for confirm new page is opened

       my_Driver.findElement(By.name("email")).sendKeys("khaledmohamedalhain@gmail.com");//pass for name locator
       // my_Driver.findElement(By.tagName("Email Address")).sendKeys("khaledmohamedalhain@gmail.com");//fail to find email field in login
        //my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("khaledmohamedalhain@gmail.com");//pass to find email field
        my_Driver.findElement(By.name("password")).sendKeys("123456Khaled");//pass for find pass field
       // my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("123456Khaled");
       //my_Driver.findElement(By.name("Login")).click();//fail for click by name
        my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).submit();
    }
    @Test(description = "Verify that 'Logged in as username' is visible" , priority = 2)
    public void Logged_In(){


        WebElement Logged = my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
        Assert.assertTrue(Logged.isDisplayed());
        my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();

    }
    @Test(description = "Verify that 'ACCOUNT DELETED!' is visible",priority = 3)
    public void Account_Deleted (){
        WebElement delete=my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2"));
        Assert.assertTrue(delete.isDisplayed());
        my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

    }
    @AfterTest
    @Test(description = "Verify that the browser is closed after finish class script" ,priority = 4 )
    public void close(){
        my_Driver.quit();
    }





}
