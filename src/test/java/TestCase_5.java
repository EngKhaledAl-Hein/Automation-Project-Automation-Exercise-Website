import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_5 {
    //to accept this test case you should run class 1 twice and the message will appear
   WebDriver driver ;
    @BeforeClass
    public void Setup(){
        driver=new ChromeDriver() ;
        driver.get("https://www.automationexercise.com");
    }
    @Test(description = "Verify that home page is visible successfully",priority = 0)
    public void homepage(){
        String title=driver.getTitle();
        Assert.assertEquals(title,"Automation Exercise");
    }
    @Test(description = "Verify 'New User Signup!' is visible" , priority = 1)
    public void text_Visible() {
        driver.findElement(By.partialLinkText("Login")).click();
        String signupText= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();
        Assert.assertEquals(signupText,"New User Signup!");
    }
    @Test(description = "Verify that 'ENTER ACCOUNT INFORMATION' is visible" , priority = 2)
    public void NewUser_Info(){
     //   driver.findElement(By.name("name")).sendKeys(" Khaled Al-Hein");
        driver.findElement(By.name("name")).sendKeys("Khaled");//pass
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("khaledmohamedalhain@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();

    }
    @Test(description = "Verify error 'Email Address already exist!' is visible",priority = 3)
    public void Exist_Email(){
        WebElement Exist_Message=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));
        Assert.assertTrue(Exist_Message.isDisplayed());

    }
    //@AfterTest
    @AfterClass

//    @Test(description = "Verify that the browser is closed after finish class script" , priority = 4)// pass and done
//    public void Close_Browser(){
//        driver.quit();
//  }
    public void Close_Browser(){// with this way pass and done
        driver.quit();
    }
  }
