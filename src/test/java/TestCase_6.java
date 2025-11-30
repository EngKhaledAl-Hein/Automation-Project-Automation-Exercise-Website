import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_6 {
    WebDriver driver ;
    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver() ;
        driver.get("https://www.automationexercise.com");
    }
    @Test(description = "Verify that home page is visible successfully" , priority = 0)
    public void homepage(){
        String title=driver.getTitle();
        Assert.assertEquals(title,"Automation Exercise");
        driver.findElement(By.partialLinkText("Contact us")).click();
    }
    @Test(description = " Verify 'GET IN TOUCH' is visible", priority = 1)
    public void Contact_Visible(){
//        WebElement Contact_Text= driver.findElement(By.className("Contact "));
//        Assert.assertTrue(Contact_Text.isDisplayed());
//        WebElement text= driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[1]/div/div"));// pass to launch new page of contact us
//        Assert.assertTrue(text.isDisplayed());
        String title=driver.getTitle();
        Assert.assertEquals(title , "Automation Exercise - Contact Us");// pass to launch next page
        driver.findElement(By.name("name")).sendKeys("Khaled ");
        driver.findElement(By.name("email")).sendKeys("engkhaled7654@gmail.com ");
        driver.findElement(By.name("subject")).sendKeys("Test Automation");
        driver.findElement(By.name("message")).sendKeys("It is a great (opportunity) chance for me to make appointment of a track to develop my skills");
       // driver.findElement(By.id("message")).sendKeys("It is a great (opportunity) chance for me to make appointment of a track to develop my skills ");
       // driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input")).click();
        WebElement file=driver.findElement(By.name("upload_file"));
        //file.sendKeys("\"C:\\Users\\Khaled Alhein\\Downloads\\Gig_2_Linked IN _Whatsapp_test.pdf\"");
        file.sendKeys("C:\\Users\\YourUser\\Desktop\\testfile.txt");


    }
}
